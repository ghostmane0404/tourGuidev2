package system.controller;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import system.dao.impl.AdminDaoImpl;
import system.dao.impl.GuideDaoImpl;
import system.model.Tour;
import system.model.User;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {

    @RequestMapping(value = "/createGuide", method = RequestMethod.POST)
    public @ResponseBody
    String createGuide(@ModelAttribute("guideFromForm") User user) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("db-conf.xml");

        AdminDaoImpl db =
                (AdminDaoImpl) context.getBean("jdbcTemplateAdminDao");
        db.createGuide(user);

        return "OK";
    }

    @RequestMapping(value = "/createTour", method = RequestMethod.POST)
    public @ResponseBody
    String createTour(@ModelAttribute("tourFromAdmin") Tour tour) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("db-conf.xml");
        AdminDaoImpl db =
                (AdminDaoImpl) context.getBean("jdbcTemplateAdminDao");
        db.createTour(tour);
        return "OK";
    }

    @RequestMapping(value = "/deleteGuide", method = RequestMethod.POST)
    public @ResponseBody
    String deleteGuide(@ModelAttribute("removingGuide") User user) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("db-conf.xml");
        AdminDaoImpl db =
                (AdminDaoImpl) context.getBean("jdbcTemplateAdminDao");
        db.deleteGuide(user.getLogin());
        return "OK";
    }

}