package system.controller;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import system.dao.UserDaoImp;
import system.model.User;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {

    @RequestMapping(value = "/view")
    @ResponseBody
    public String validateUser() {
        return "Admin";
    }

}
