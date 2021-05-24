package Covid19project.Service.AddressService;

import Covid19project.Repository.AddressRepository.IAddressRepo;
import Covid19project.Model.Data.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements IAddressService{
    @Autowired
    IAddressRepo iAddressRepo;

    @Override
    public Address addAddress(Address address) {
        return null;
    }

    @Override
    public List<Address> fetchAllAddresses() {
        return iAddressRepo.fetchAllAddresses();
    }

    @Override
    public Address findAddressById(int addressId) {
        return null;
    }

    @Override
    public Address findAddressByName(String streetName) {
        return null;
    }

    @Override
    public Address updateAppointment(int addressId, Address address) {
        return null;
    }

    @Override
    public Boolean deleteAddress(int addressId) {
        return null;
    }
}
