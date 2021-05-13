package Covid19project;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

    @Autowired // Spring will create the instance
    //private Repo repo;


    @RequestMapping(value = { "/login" }, method = RequestMethod.GET)
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login"); // resources/template/login.html
        return modelAndView;
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public ModelAndView register() {
        ModelAndView modelAndView = new ModelAndView();
        // User user = new User();
        // modelAndView.addObject("user", user);
        modelAndView.setViewName("register"); // resources/template/register.html
        return modelAndView;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index"); // resources/template/index.html
        return modelAndView;
    }



    /*@GetMapping("/")
    public String Index() {
        return "index";
    }*/

    @GetMapping("/booking")
    public String getBooking(Model model){
       model.addAttribute("activePage", "booking");
        return "booking";
    }

    @GetMapping("/vaccine")
    public String getVaccine(Model model){
     model.addAttribute("activePage", "vaccine");
        return "vaccine";
    }

   /* @GetMapping("/login")
    public String getLogin(Model model){
        model.addAttribute("activePage", "login");
        return "login";
    }*/


}




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


