package Covid19project.Model;

import Covid19project.Model.Lists.AddressList;
import Covid19project.Model.Lists.AppointmentList;
import Covid19project.Model.Lists.CenterList;
import Covid19project.Model.Lists.UserList;

import java.sql.Statement;

public class Model {

    private AddressList addressList;
    private AppointmentList appointmentList;
    private CenterList centerList;
    private UserList userList;

    public Model (Statement statement) {
        addressList = new AddressList(statement);
        userList = new UserList(statement, addressList);
        centerList = new CenterList(statement, addressList);
        appointmentList = new AppointmentList(statement, centerList, userList);

    }

}
