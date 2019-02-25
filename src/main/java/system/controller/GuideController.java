package system.controller;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import system.dao.GuideDao;
import system.dao.GuideDaoImpl;
import system.dao.UserDaoImp;
import system.model.Tour;
import system.model.User;

@Controller
@RequestMapping(value = "/guide")
public class GuideController {

    @RequestMapping(value = "/createTour", method = RequestMethod.POST)
    public @ResponseBody
    String checkUser(@ModelAttribute("tourFromGuide") Tour tour) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("db-conf.xml");

        GuideDaoImpl db =
                (GuideDaoImpl) context.getBean("jdbcTemplateGuideDao");
        db.createTour(tour);

        return "OK?";
    }
}
