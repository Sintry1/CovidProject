package Covid19project.Repository.AddressRepository;

import Covid19project.model.Data.Address;
import Covid19project.model.Data.Appointment;

import java.util.List;

public interface IAddressRepo {

    //Create
    Address addAddress(Address address);

    //READ
    List<Address> fetchAllAddresses();
    Address findAddressById(int addressId);
    Address findAddressByName(String streetName);

    //Update
    Address updateAppointment(int addressId, Address address);


    //Delete
    Boolean deleteAddress(int addressId);
}
