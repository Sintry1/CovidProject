package Covid19project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



    @Controller
    public class PageController {


        @GetMapping("/")
        public String Index(Model model) {
            return "index";
        }


        @GetMapping("/info")
        public String getInfo(Model model){
            /*model.addAttribute("activePage", "info");*/
            return "info";
        }

        @GetMapping("/contact")
        public String getContact(Model model){
            /*model.addAttribute("activePage", "contact");*/
            return "contact";
        }


    }

