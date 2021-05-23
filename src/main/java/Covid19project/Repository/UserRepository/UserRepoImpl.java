package Covid19project.Repository.UserRepository;

import Covid19project.model.Data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import java.util.List;

@Repository
public class UserRepoImpl implements IUserRepo{

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public User addNewUser(User user) {
        return null;
    }

    @Override
    public List<User> fetchAllUsers() {
        String sql = "SELECT * FROM auth_user";
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<>(User.class);
        return jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public User findUserByCpr(int cpr) {
        return null;
    }

    @Override
    public User findUserByRole(String roleName) {
        return null;
    }

    @Override
    public User findUserByFirstName(String firstName) {
        return null;
    }

    @Override
    public User updateUser(int cpr, User user) {
        return null;
    }

    @Override
    public Boolean deleteUser(int cpr) {
        return null;
    }
}
