package Covid19project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {


    @GetMapping("/admin")
    public String getManagement(){
        return "admin/management";
    }

    @GetMapping("/admin/manageUser")
    public String getManageUsers(){
        return "admin/manageUser";
    }

    @GetMapping("/admin/manageAddress")
    public String getManageAddress(){
        return "admin/manageAddress";
    }

    @GetMapping("/admin/manageTestCenter")
    public String getManageTestCenter(){
        return "admin/manageTestCenter";
    }
}
