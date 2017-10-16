package by.onyx.web.controller.nav;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SystemController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(ModelMap modelMap){
        modelMap.addAttribute("test", "INDEX Page!");
        return "index";
    }

    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public String page(ModelMap modelMap){
        modelMap.addAttribute("test", "Page 1");
        return "page";
    }
}
