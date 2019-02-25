package system.controller;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import system.dao.UserDaoImp;
import system.model.Tour;
import system.model.User;

@Controller
@RequestMapping("/users")
public class UserController {
    /*@Autowired
    private UserService userService;*/

    /*@RequestMapping(value = "/list", method = RequestMethod.GET)
    public @ResponseBody
    List<User> getAllUsers() {
        return userService.getAllUsers();
    }*/

    @RequestMapping(value = "/search_by_id", method = RequestMethod.GET)
    public ModelAndView validateUser() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userFromServer", new User());
        modelAndView.setViewName("user_search_page");
        return modelAndView;
    }

    @RequestMapping(value = "/check", method = RequestMethod.POST)
    public @ResponseBody
    String checkUser(@ModelAttribute("userFromServer") User user) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("db-conf.xml");

        UserDaoImp jdbcTemplateDeveloperDao =
                (UserDaoImp) context.getBean("jdbcTemplateDeveloperDao");
        return jdbcTemplateDeveloperDao.getUserById(user.getId()).toString();
    }

    @RequestMapping(value = "/auth", method = RequestMethod.GET)
    public ModelAndView authUser() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userFromClient", new User());
        modelAndView.setViewName("auth_page");
        return modelAndView;
    }

    @RequestMapping(value = "/valid", method = RequestMethod.POST)
    public @ResponseBody
    ModelAndView validUser(@ModelAttribute("userFromClient") User user) {
        ModelAndView modelAndView = new ModelAndView();
        ApplicationContext context =
                new ClassPathXmlApplicationContext("db-conf.xml");

        UserDaoImp fromDb =
                (UserDaoImp) context.getBean("jdbcTemplateDeveloperDao");
        String nameFromForm = user.getName();
        String passwordFromForm = user.getPassword();

        try {
            User userFromDb = fromDb.getUserByLogin(nameFromForm);
            if (passwordFromForm.equals(userFromDb.getPassword())) {
                switch (userFromDb.getMast()) {
                    case "guide":
                        modelAndView.setViewName("guide_page");
                        modelAndView.addObject("tourFromGuide", new Tour());
                        return modelAndView;
                    case "admin":
                        modelAndView.setViewName("admin_page");
                        return modelAndView;
                    case "boss":
                        modelAndView.setViewName("boss_page");
                        return modelAndView;
                    default:
                        modelAndView.setViewName("error_page");
                        return modelAndView;
                }
            } else {
                modelAndView.setViewName("error_page");
                return modelAndView;
            }

        } catch (Exception e) {
            modelAndView.setViewName("error_page");
            return modelAndView;
        }
    }

}
