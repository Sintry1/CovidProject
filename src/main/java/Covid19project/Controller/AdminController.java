package Covid19project.Controller;

import Covid19project.Repository.UserRepository.IUserRepo;
import Covid19project.Service.AddressService.IAddressService;
import Covid19project.Service.TestCenterService.ITestCenterService;
import Covid19project.Service.UserService.IUserService;
import Covid19project.model.Data.Address;
import Covid19project.model.Data.TestCenter;
import Covid19project.model.Data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    IUserService iUserService;
    @Autowired
    IAddressService iAddressService;
    @Autowired
    ITestCenterService iTestCenterService;

    @GetMapping("/admin")
    public String getManagement(){
        return "admin/management";
    }


    @GetMapping("/admin/manageUser")
    public String displayUsers(Model model) {
        List<User> userList = iUserService.fetchAllUsers();
        model.addAttribute("myUsers", userList);
        return "admin/manageUser";
    }

    @GetMapping("/admin/manageAddress")
    public String getManageAddress(Model model){
        List<Address> addressList = iAddressService.fetchAllAddresses();
        model.addAttribute("myAddresses", addressList);

        return "admin/manageAddress";
    }

    @GetMapping("/admin/manageTestCenter")
    public String getManageTestCenter(Model model){
        List<TestCenter> testCentersList = iTestCenterService.fetchAllCenters();
        model.addAttribute("myTestCenters", testCentersList);

        return "admin/manageTestCenter";
    }
}
