package Covid19project.Service.UserService;

import Covid19project.Model.Data.Role;
import Covid19project.Model.Data.User;

import java.util.List;


public interface IUserService {
    //Create
    User addNewUser(User user);
    User addNewUserRole(User user);
    //READ
    List<User> fetchAllUsers();
    User findUserByCpr(Long cpr);
    User findUserByRole(String roleName);
    User findUserByFirstName(String firstName);

    //Update
    User updateUser(Long cpr, User user);

    //Delete
    Boolean deleteUser(Long cpr);

    // ROLES
    List<Role> fetchAllRoles();
    Role updateRole(int cpr, Role role);
    Boolean deleteRole(int cpr);

}
