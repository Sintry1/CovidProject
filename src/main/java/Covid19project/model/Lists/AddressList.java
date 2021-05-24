package Covid19project.Model.Lists;

import Covid19project.Model.Data.Address;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.*;

public class AddressList {

    private ArrayList<Address> addressList;

    public AddressList(Statement statement) {
        addressList = new ArrayList<>();

        try {
            String sql = "SELECT * FROM testcenterdb.address";
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                addressList.add(new Address(rs.getInt("addressId"),
                        rs.getString("streetName"),
                        rs.getInt("streetNumber"),
                        rs.getInt("postcode"),
                        rs.getString("city")));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void saveToDatabase(Statement statement) {
        try {
            String sql1 = "TRUNCATE TABLE testcentredb.address";
            statement.executeUpdate(sql1);

            for (Address a : addressList) {
                String sql2 = String.format("INSERT INTO testcentredb.address (streetName, streetNumber, postCode, city)" +
                                "VALUES ('%s', '%d', '%d', '%s')",
                        a.getStreetName(),
                        a.getStreetNumber(),
                        a.getPostCode(),
                        a.getCity());

                int id = statement.executeUpdate(sql2, Statement.RETURN_GENERATED_KEYS);
                a.setId(id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void add(Address address) {
        addressList.add(address);
    }

    public void remove(Address address) {
        addressList.remove(address);
    }

    public Address getAddress(int id){
        for(Address g : addressList){
            if(g.getId() == id) return g;
        }
        return null;
    }

    public Address select(Scanner scanner) {

        int index;
        String input;

        do {
            try {
                System.out.println("Please select an address: ");
                input = scanner.nextLine();

                if (input.equals("")) return null;

                index = Integer.valueOf(input);
            } catch (Exception e) {
                System.out.println("Input is incorrect. Please try again.");
                index = -1;
            }
        }
        while (index < 0 || index >= addressList.size());

        return addressList.get(index);
    }

    @Override
    public String toString() {
        return "AddressList{" +
                "addressList=" + addressList +
                '}';
    }

    public ArrayList<Address> getAddressList() {
        return addressList;
    }

}