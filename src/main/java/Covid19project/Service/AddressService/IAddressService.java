package Covid19project.Service.AddressService;

import Covid19project.Model.Data.Address;

import java.util.List;

public interface IAddressService {
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
