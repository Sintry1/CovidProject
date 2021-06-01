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


   /* @RequestMapping(value = { "/login" }, method = RequestMethod.GET)
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login"); // resources/template/login.html
        return modelAndView;
    }*/

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

    @PostMapping("/myappointments")
    public String showUserAppointment(@RequestParam(value = "userCpr", required = false) Integer cpr, Model model)
    {

        model.addAttribute("iTestCenterService", iTestCenterService);
        model.addAttribute("userCpr", iAppointmentService.findAppointmentByCpr(cpr));
        return "profile/myappointments";
    }

    @PostMapping("/mydetails")
    public String showUserDetails(@RequestParam(value = "userCprDetails", required = false) Integer cpr, Model model)
    {
        model.addAttribute("iAddressService", iAddressService);
        model.addAttribute("userCprDetails", iUserService.findUserByCpr(cpr));
        return "profile/mydetails";
    }

    @GetMapping("/deleteMyAppointment/{apptID}")
    public String deleteAppointment(@PathVariable int apptID) {
        iAppointmentService.deleteAppointment(apptID);
        return "redirect:/profile";
    }





}


    /*@RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index"); // resources/template/index.html
        return modelAndView;
    }*/



 /*  @PostMapping("/profile")
    public String getProfileAppts(@RequestParam("cpr") int cpr){
    iAppointmentService.findAppointmentByCpr(cpr);

      model.addAttribute("userAppointment", iAppointmentService.findAppointmentByCpr(cpr));
       model.addAttribute("iAppointmentService", iAppointmentService.fetchAllAppts());
        return "profile";
    }*/




    /*@GetMapping("/profile")
    public String showStudentBySurname(Model model) {


        model.addAttribute("search", iAppointmentService.findAppointmentByCpr());
        return "profile";
    }*/






   /* @GetMapping("/")
    public String index(Model model){
        //List<Person> list = repo.fetchAll();
        //System.out.println(list.toString());
        model.addAttribute("users", repo.fetchAll());
        return "home/index";

    }

    @PostMapping("/create")
    public String addPerson(User user){
        System.out.println("addPerson called " + user.getName());
        repo.addPerson(user);
        //return "index";
        return "redirect:/"; // will behave as if the browser asked for the "/"
    }

    @PostMapping(value = "/edit" , params = "delete")
    public String delete(@RequestParam("id") int id){
        System.out.println("Delete method called on ID: " +id);
        repo.delete(id);
        return "redirect:/";

    }

    @PostMapping(value = "/edit" , params = "update")
    public String update(User user){
        System.out.println("ID : " + user.getId() + " Updated with : " + user.getName());
        repo.update(user);
        return "redirect:/";

    }*/


