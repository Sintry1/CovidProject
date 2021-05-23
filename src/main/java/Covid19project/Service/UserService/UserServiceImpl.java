package Covid19project.Service.UserService;

import Covid19project.Repository.UserRepository.IUserRepo;
import Covid19project.model.Data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService  {

    @Autowired
    IUserRepo iUserRepo;

    @Override
    public User addNewUser(User user) {
        return iUserRepo.addNewUser(user);
    }

    @Override
    public List<User> fetchAllUsers() {
        return iUserRepo.fetchAllUsers();
    }

    @Override
    public User findUserByCpr(int cpr) {
        return iUserRepo.findUserByCpr(cpr);
    }

    @Override
    public User findUserByRole(String roleName) {
        return iUserRepo.findUserByRole(roleName);
    }

    @Override
    public User findUserByFirstName(String firstName) {
        return iUserRepo.findUserByFirstName(firstName);
    }

    @Override
    public User updateUser(int cpr, User user) {
        return iUserRepo.updateUser(cpr,user);
    }

    @Override
    public Boolean deleteUser(int cpr) {
        return iUserRepo.deleteUser(cpr);
    }
}
