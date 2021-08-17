package Covid19project.Controller;

import Covid19project.Model.Data.Appointment;
import Covid19project.Model.Data.User;
import Covid19project.Service.AddressService.IAddressService;
import Covid19project.Service.AppointmentService.IAppointmentService;
import Covid19project.Service.TestCenterService.ITestCenterService;
import Covid19project.Service.UserService.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

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

    @GetMapping("/booking")
    public String getBooking(Model model){
        model.addAttribute("iTestCenterService", iTestCenterService);
        model.addAttribute("iAppointmentService", iAppointmentService);
        model.addAttribute("iUserService", iUserService);
        //model.addAttribute("appointment", "booking");
        return "booking";
    }

    // DIPSLAY APPOINTMENTS
    @GetMapping("/admin/manageAppointment")
    public String getManageAppointment(Model model,Long cpr){
        List<Appointment> appointmentList = iAppointmentService.fetchAllAppts();
        model.addAttribute("iTestCenterService", iTestCenterService);
        model.addAttribute("myAppointments", appointmentList);

        return "admin/Appointment/manageAppointment";

    }

    // DELETE APPOINTMENT
    @GetMapping("/deleteAppointment/{apptID}")
    public String deleteAppointment(@PathVariable int apptID) {
        iAppointmentService.deleteAppointment(apptID);
        return "redirect:/admin/manageAppointment";
    }

    // CREATE APPOINTMENT

    @PostMapping("/success")
    public String addNewAppointment(@ModelAttribute Appointment appointment,Model model) {
        model.addAttribute("iTestCenterService", iTestCenterService);
        iAppointmentService.addAppointment(appointment);

        return "success";   // After appointment is made, user get redirected to Success page.
    }

    @GetMapping("/updateAppointment/{apptID}")
    public String updateAppointment(@PathVariable int apptID, Model model){
        model.addAttribute("iTestCenterService", iTestCenterService);
        //get appointment by id
        Appointment appointment = iAppointmentService.findAppointmentById(apptID);

        //set appointment as a mode attribute to pre populate the form
        model.addAttribute("updatedAppointment",appointment);

        return "admin/Appointment/updateAppointment";
    }


    @PostMapping("/saveAppointment/{apptID}")
    public String saveAppointment(@PathVariable int apptID, Appointment appointment) {
        iAppointmentService.updateAppointment(apptID, appointment);
        return "redirect:/profile";

    }




}
