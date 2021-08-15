package Covid19project.Repository.UserRepository;

import Covid19project.Model.Data.Role;
import Covid19project.Model.Data.User;

import java.util.List;


public interface IUserRepo {


    //Create
    User addNewUser(User user);
    User addNewUserRole(User user);
    //READ
    List<User> fetchAllUsers();
    User findUserByCpr(long cpr);
    User findUserByRole(String roleName);
    User findUserByFirstName(String firstName);

    //Update
    User updateUser(long cpr, User user);

    //Delete
    Boolean deleteUser(long cpr);


    // ROLES
    List<Role> fetchAllRoles();
    Role updateRole(long cpr, Role role);
    Boolean deleteRole(long cpr);


}
