package by.onyx.web.controller.nav;

import by.onyx.common.pojo.User;
import by.onyx.common.service.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class SystemController {

    @Autowired
    private UserData userData;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(ModelMap modelMap){
        List<User> userList = userData.getAllUser();
        modelMap.addAttribute("test", "Page 1");
        modelMap.addAttribute("users", userList);
        return "index";
    }

    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public String page(ModelMap modelMap){
        modelMap.addAttribute("test", "Page 2");
        return "page";
    }
}
