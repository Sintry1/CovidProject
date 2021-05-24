package Covid19project.Model.Lists;

import Covid19project.Model.Data.Address;
import Covid19project.Model.Data.User;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class UserList {

    private ArrayList<User> userList;

    public UserList(Statement statement, AddressList addressList) {
        userList = new ArrayList<>();

        try {
            String sql = "SELECT * FROM testcenterdb.user";
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()){

                int addressId = rs.getInt("addressIid");

                userList.add(new User(rs.getInt("cpr"),
                        rs.getString("firstName"),
                        rs.getString("surname"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getDate("dateOfBirth").toLocalDate(),
                        rs.getString("status"),
                        addressList.getAddress(addressId),
                        rs.getInt("addressId")));
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void saveToDatabase(Statement statement) {
        try {
            String sql1 = "TRUNCATE TABLE testcentredb.user";
            statement.executeUpdate(sql1);

            for (User u : userList) {
                String sql2 = String.format("INSERT INTO testcentredb.user (cpr, firstName, surname, addressid, email, password, dateOfBirth, status)" +
                                "VALUES ('%d', '%s', '%s', '%d', '%s', '%s', '%d', '%s')",
                        u.getCPR(),
                        u.getFirstName(),
                        u.getSurname(),
                        u.getAddress(),
                        u.getEmail(),
                        u.getPassword(),
                        u.getDateOfBirth(),
                        u.getStatus());

                int id = statement.executeUpdate(sql2, Statement.RETURN_GENERATED_KEYS);
                u.setCPR(id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void add(User user) {
        userList.add(user);
    }

    public void remove(User user) {
        userList.remove(user);
    }

    @Override
    public String toString() {
        return "UserList{" +
                "userList=" + userList +
                '}';
    }

    public User getUser(int id){
        for(User u : userList){
            if(u.getCPR() == id) return u;
        }
        return null;
    }

    public User select(Scanner scanner) {

        int index;
        String input;

        do {
            try {
                System.out.println("Please select a user: ");
                input = scanner.nextLine();

                if (input.equals("")) return null;

                index = Integer.valueOf(input);
            } catch (Exception e) {
                System.out.println("Input is incorrect. Please try again.");
                index = -1;
            }
        }
        while (index < 0 || index >= userList.size());

        return userList.get(index);
    }

    public ArrayList<User> getUserList() {
        return userList;
    }
}