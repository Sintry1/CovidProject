package Covid19project.Model.Lists;

import Covid19project.Model.Data.Address;
import Covid19project.Model.Data.Appointment;
import Covid19project.Model.Data.TestCenter;
import jdk.incubator.vector.VectorOperators;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class CenterList {

    private ArrayList<TestCenter> centerList;

    public CenterList(Statement statement, AddressList addressList) {
        centerList = new ArrayList<>();

        try{
            String sql = "SELECT * FROM testcenterdb.test_center";
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {

                int addressId = rs.getInt("center_addressId");

                centerList.add(new TestCenter(rs.getString("name"),
                        addressList.getAddress(addressId)));
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void saveToDatabase(Statement statement, AddressList addressList) {
        try {
            String sql1 = "TRUNCATE TABLE testcentredb.test_center";
            statement.executeUpdate(sql1);

            for (TestCenter c : centerList) {
                String sql2 = String.format("INSERT INTO testcentredb.test_center ('name', 'center_addressid')" +
                                "VALUES ('%s', '%d')",
                        c.getName(),
                        (c.getAddress() == null ? -1 : c.getAddress().getId()));

                int id = statement.executeUpdate(sql2, Statement.RETURN_GENERATED_KEYS);
                c.setTestCenterId(id);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void add(TestCenter testCenter) {
        centerList.add(testCenter);
    }

    public void remove(TestCenter testCenter) {
        centerList.remove(testCenter);
    }

    public TestCenter getCenter(int id) {
        for(TestCenter t : centerList){
            if(t.getTestCenterId() == id) return t;
        }

        return null;
    }

    public TestCenter select(Scanner scanner) {

        int index;
        String input;

        do {
            try {
                System.out.println("Please select a test center: ");
                input = scanner.nextLine();

                if (input.equals("")) return null;

                index = Integer.valueOf(input);
            } catch (Exception e) {
                System.out.println("Input is incorrect. Please try again.");
                index = -1;
            }
        }
        while (index < 0 || index >= centerList.size());

        return centerList.get(index);

    }

    @Override
    public String toString() {
        return "CenterList{" +
                "centerList=" + centerList +
                '}';
    }

    public ArrayList<TestCenter> getCenterList() {
        return centerList;
    }
}
