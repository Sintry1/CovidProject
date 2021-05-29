package Covid19project.Controller;

import Covid19project.Model.Data.*;
import Covid19project.Service.AddressService.IAddressService;
import Covid19project.Service.AppointmentService.IAppointmentService;
import Covid19project.Service.TestCenterService.ITestCenterService;
import Covid19project.Service.UserService.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    IUserService iUserService;
    @Autowired
    IAddressService iAddressService;
    @Autowired
    ITestCenterService iTestCenterService;
    @Autowired
    IAppointmentService iAppointmentService;

    @GetMapping("/admin")
    public String getManagement(){
        return "admin/management";
    }


    @GetMapping("/admin/manageUser")
    public String displayUsers(Model model, Integer keyword) {
        List<User> userList = iUserService.fetchAllUsers();
        model.addAttribute("iAddressService", iAddressService);

        if(keyword != null){
            model.addAttribute("myUsers",iUserService.findUserByCpr(keyword));
        }
        else {
            model.addAttribute("myUsers", userList);
        }
        return "admin/User/manageUser";
    }

    @GetMapping("/showNewUserForm")
    public String newUserForm(Model model){
        model.addAttribute("iUserService", iUserService);
        model.addAttribute("newUser", new User());
        return "admin/User/newUser";
    }
    @PostMapping("/addUser")
    public String addNewUser(@ModelAttribute User user) {
        iUserService.addNewUser(user);
        iUserService.addNewUserRole(user);
        return "redirect:/admin/manageUser";

    }

    @GetMapping("/updateUser/{cpr}")
    public String updateAppointment(@PathVariable int cpr, Model model){
        model.addAttribute("iAddressService", iAddressService);
        //get user by cpr
        User user = iUserService.findUserByCpr(cpr);

        //set user as a mode attribute to pre populate the form
        model.addAttribute("updatedUser",user);

        return "admin/User/updateUser";
    }
    @PostMapping("/saveUser/{cpr}")
    public String saveUser(@PathVariable int cpr, User user) {
        iUserService.updateUser(cpr, user);
        return "redirect:/admin/manageUser";

    }



   /* @GetMapping("/deleteUser/{cpr}")
    public String deleteUser(@PathVariable int cpr) {
        iUserService.deleteUser(cpr);
        return "redirect:/admin/manageUser";
    }*/


    @GetMapping("/admin/manageAddress")
    public String getManageAddress(Model model){
        List<Address> addressList = iAddressService.fetchAllAddresses();
        model.addAttribute("myAddresses", addressList);
        return "admin/Address/manageAddress";
    }

    @GetMapping("/deleteAddress/{addressid}")
    public String deleteAddress(@PathVariable int addressid) {
        iAddressService.deleteAddress(addressid);
        return "redirect:/admin/manageAddress";
    }


    @GetMapping("/admin/manageTestCenter")
    public String getManageTestCenter(Model model){
        List<TestCenter> testCentersList = iTestCenterService.fetchAllCenters();
        model.addAttribute("iAddressService", iAddressService);
        model.addAttribute("myTestCenters", testCentersList);

        return "admin/TestCenter/manageTestCenter";
    }
    @GetMapping("/deleteTestCenter/{testcenterId}")
    public String deleteTestCenter(@PathVariable int testcenterId) {
       iTestCenterService.deleteTestCenter(testcenterId);
        return "redirect:/admin/manageTestCenter";
    }




    @GetMapping("/admin/manageAppointment")
    public String getManageAppointment(Model model,Integer keyword){
        List<Appointment> appointmentList = iAppointmentService.fetchAllAppts();
        model.addAttribute("iUserService", iUserService);
        model.addAttribute("iTestCenterService", iTestCenterService);

        if(keyword != null){
            model.addAttribute("myAppointments", iAppointmentService.findAppointmentByCpr(keyword));
        }
        else {
            model.addAttribute("myAppointments", appointmentList);
        }

        return "admin/Appointment/manageAppointment";

    }


    @GetMapping("/deleteAppointment/{apptID}")
    public String deleteAppointment(@PathVariable int apptID) {
        iAppointmentService.deleteAppointment(apptID);
        return "redirect:/admin/manageAppointment";
    }

}
