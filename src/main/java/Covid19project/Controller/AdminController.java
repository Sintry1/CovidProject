package Covid19project.Controller;

import Covid19project.Model.Data.*;
import Covid19project.Service.AddressService.IAddressService;
import Covid19project.Service.AppointmentService.IAppointmentService;
import Covid19project.Service.TestCenterService.ITestCenterService;
import Covid19project.Service.UserService.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
        return "admin/manageUser";
    }

    @GetMapping("/showNewUserForm")
    public String newUserForm(Model model){
        model.addAttribute("iUserService", iUserService);
        model.addAttribute("newUser", new User());
        return "admin/newUser";
    }
    @PostMapping("/addUser")
    public String addNewUser(@ModelAttribute User user) {
        iUserService.addNewUser(user);
        iUserService.addNewUserRole(user);
        return "admin/management";
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
        model.addAttribute("iAddressService", iAddressService);
        model.addAttribute("myTestCenters", testCentersList);

        for(TestCenter testCenter : testCentersList) {
            System.out.println(testCenter.getName());
        }

        return "admin/manageTestCenter";
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

   /* System.out.println(appointmentList.toString());

        for(Appointment appointment : appointmentList) {
            System.out.println(appointment.getCprOfUser());
            System.out.println(appointment.getApptId());
        }*/

        return "admin/manageAppointment";

    }


    @PostMapping("/deleteAppointment")
    public String deleteAppointment(@ModelAttribute Appointment appointment) {
        iAppointmentService.deleteAppointment(appointment.getApptId());
        return "admin/management";
    }

}
