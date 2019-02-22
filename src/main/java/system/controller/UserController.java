package system.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import system.dao.UserDaoImp;
import system.model.User;
import system.service.UserService;

import java.util.List;

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

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public @ResponseBody String getAllUsers() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("db-conf.xml");

        UserDaoImp jdbcTemplateDeveloperDao =
                (UserDaoImp) context.getBean("jdbcTemplateDeveloperDao");
        return jdbcTemplateDeveloperDao.getUserById(1).toString();
    }

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


}
