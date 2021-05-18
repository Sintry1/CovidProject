package Covid19project.model.Lists;

import Covid19project.model.Data.Address;

import java.beans.Statement;
import java.util.ArrayList;

public class AddressList {

    private ArrayList<Address> addressList = new ArrayList<>();

    @Override
    public String toString() {
        return "AddressList{" +
                "addressList=" + addressList +
                '}';
    }

    public AddressList(Statement statement){

    }

    public ArrayList<Address> getAddressList() {
        return addressList;
    }
}
