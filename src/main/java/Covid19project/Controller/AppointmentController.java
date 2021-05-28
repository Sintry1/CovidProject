package Covid19project.Controller;

import Covid19project.Model.Data.Appointment;
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

@Controller
public class AppointmentController {

    @Autowired
    ITestCenterService iTestCenterService;
    @Autowired
    IAppointmentService iAppointmentService;
    @Autowired
    IUserService iUserService;
    @Autowired
    IAddressService iAddressService;

    @GetMapping("/booking")  // Appointment interface
    public String getBooking(Model model){
        model.addAttribute("iTestCenterService", iTestCenterService);
        model.addAttribute("iAppointmentService", iAppointmentService);
        model.addAttribute("iUserService", iUserService);
        model.addAttribute("appointment", "booking");
        return "booking";
    }



    @PostMapping("/success")
    public String addNewAppointment(@ModelAttribute Appointment appointment,Model model) {
        model.addAttribute("iTestCenterService", iTestCenterService);
        iAppointmentService.addAppointment(appointment);

        return "success";   // After appointment is made, user get redirected to Success page.
    }



}
