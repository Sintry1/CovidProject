package Covid19project.Repository.AddressRepository;

import Covid19project.model.Data.Address;
import Covid19project.model.Data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AddressRepoImpl implements IAddressRepo {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public Address addAddress(Address address) {
        return null;
    }

    @Override
    public List<Address> fetchAllAddresses() {
        String sql = "SELECT * FROM address";
        RowMapper<Address> rowMapper = new BeanPropertyRowMapper<>(Address.class);
        return jdbcTemplate.query(sql, rowMapper);
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
