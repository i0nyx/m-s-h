package by.onyx.web.controller.rest;

import by.onyx.common.pojo.User;
import by.onyx.common.service.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/rest")
public class SystemRestController{

    @Autowired
    private UserData userData;

    @RequestMapping(value = "add/", method = RequestMethod.POST)
    public void save(@RequestBody User user){
        userData.save(user);
    }
}
