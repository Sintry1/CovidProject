package Covid19project.Controller;


import Covid19project.Model.Data.Appointment;
import Covid19project.Model.Data.TestCenter;
import Covid19project.Service.AddressService.IAddressService;
import Covid19project.Service.AppointmentService.IAppointmentService;
import Covid19project.Service.TestCenterService.ITestCenterService;
import Covid19project.Service.UserService.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.CurrentSecurityContext;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    ITestCenterService iTestCenterService;
    @Autowired
    IAppointmentService iAppointmentService;
    @Autowired
    IUserService iUserService;
    @Autowired
    IAddressService iAddressService;



    @GetMapping("/login")
    public String login(){

        return "login";
    }

    @GetMapping("/")
    public String hello(@CurrentSecurityContext(expression="authentication.name") String username, Model model) {
        List<TestCenter> testCentersList = iTestCenterService.fetchAllCenters();
        model.addAttribute("iAddressService", iAddressService);
        model.addAttribute("myTestCenters", testCentersList);

        System.out.println("currently logged in : "+ username);
        return "index";
    }


    @GetMapping("/profile")
    public String getProfile() {

        return "profile/profile";
    }

    @PostMapping("/profile")
    public String showUserAppointment(/*@RequestParam(value = "userCpr", required = false)*/ Long cpr, Model model)
    {

        model.addAttribute("iTestCenterService", iTestCenterService);
        model.addAttribute("userCpr", iAppointmentService.findAppointmentByCpr(cpr));
        return "profile/profile";
    }

    @PostMapping("/mydetails")
    public String showUserDetails(@RequestParam(value = "userCprDetails", required = false) long cpr, Model model)
    {
        model.addAttribute("iAddressService", iAddressService);
        model.addAttribute("userCprDetails", iUserService.findUserByCpr(cpr));
        return "profile/profile";
    }

    @GetMapping("/deleteMyAppointment/{apptID}")
    public String deleteAppointment(@PathVariable int apptID) {
        iAppointmentService.deleteAppointment(apptID);
        return "redirect:/profile/profile";
    }

    @RequestMapping(value= "/profile", method = RequestMethod.GET)
    @ResponseBody
    public String currentPrincipal(HttpServletRequest request){
        Principal principal = request.getUserPrincipal();
        return principal.getName();
    }


}





