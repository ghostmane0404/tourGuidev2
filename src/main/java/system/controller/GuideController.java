package system.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import system.model.User;

@Controller
@RequestMapping(value = "/guides")
public class GuideController {

    @RequestMapping(value = "/view")
    @ResponseBody public String someMethod() {
        return "GuideDao";
    }
}
