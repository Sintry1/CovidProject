package Covid19project.Model.Lists;

import Covid19project.Model.Data.Address;
import Covid19project.Model.Data.Appointment;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class AppointmentList {

    private ArrayList<Appointment> appointmentList;

    public AppointmentList(Statement statement, CenterList centerList, UserList userList) {
        appointmentList = new ArrayList<>();

        try {
            String sql = "SELECT * FROM testcentredb.appointment";
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()){

                int centerID = rs.getInt("testCenterId");
                int userID = rs.getInt("FK_user_cpr");

                appointmentList.add(new Appointment(rs.getInt("cpr"),
                        rs.getDate("time"),
                        rs.getDate("date"),
                        centerList.getCenter(centerID),
                        userList.getUser(userID)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void saveToDatabase(Statement statement, UserList userList){
        try {
            String sql1 = "TRUNCATE TABLE testcentredb.appointment";
            statement.executeUpdate(sql1);

            for (Appointment a : appointmentList) {
                String sql2 = String.format("INSERT INTO testcentredb.appointment ('cpr', 'time', 'date', 'testCenterId)" +
                                "VALUES ('%d', '%s', '%d', '%d')",
                        a.getCpr(),
                        a.getTime(),
                        a.getDate(),
                        (a.getLocation() == null ? -1 : a.getLocation().getTestCenterId()));

                int id = statement.executeUpdate(sql2, Statement.RETURN_GENERATED_KEYS);
                a.setId(id);
        }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void add (Appointment appointment) {
        appointmentList.add(appointment);
    }

    public void remove (Appointment appointment) {
        appointmentList.remove(appointment);
    }

    @Override
    public String toString() {
        return "AppointmentList{" +
                "appointmentList=" + appointmentList +
                '}';
    }

    public Appointment getAppointment(int id){
        for(Appointment g : appointmentList){
            if(g.getId() == id) return g;
        }

        return null;
    }

    public Appointment select (Scanner scanner) {

        int index;
        String input;

        do {
            try {
                System.out.println("Please select an appointment: ");
                input = scanner.nextLine();

                if (input.equals("")) return null;

                index = Integer.valueOf(input);
            } catch (Exception e) {
                System.out.println("Input is incorrect. Please try again.");
                index = -1;
            }
        }
        while (index < 0 || index >= appointmentList.size());

        return appointmentList.get(index);
    }

    public ArrayList<Appointment> getAppointmentList() {
        return appointmentList;
    }
}
