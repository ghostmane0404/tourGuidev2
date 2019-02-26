package system.controller;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import system.dao.impl.GuideDaoImpl;
import system.model.Tour;

@Controller
@RequestMapping(value = "/guide")
public class GuideController {

    @RequestMapping(value = "/createTour", method = RequestMethod.POST)
    public @ResponseBody
    String createTour(@ModelAttribute("tourFromGuide") Tour tour) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("db-conf.xml");

        GuideDaoImpl db =
                (GuideDaoImpl) context.getBean("jdbcTemplateGuideDao");
        db.createTour(tour);

        return "OK";
    }
}
