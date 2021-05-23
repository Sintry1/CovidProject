package Covid19project.Repository.UserRepository;

import Covid19project.model.Data.User;

import java.util.List;

public interface IUserRepo {


    //Create
    User addNewUser(User user);

    //READ
    List<User> fetchAllUsers();
    User findUserByCpr(int cpr);
    User findUserByRole(String roleName);
    User findUserByFirstName(String firstName);

    //Update
    User updateUser(int cpr, User user);

    //Delete
    Boolean deleteUser(int cpr);


}
