package by.onyx.common.service.impl;

import by.onyx.common.pojo.User;
import by.onyx.common.repositories.UserRepository;
import by.onyx.common.service.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDataImpl implements UserData {

    @Autowired
    private UserRepository repositories;

    public List<User> getAllUser() {
        return repositories.findAll();
    }

    public User save(User user) {
        if(user != null){
            repositories.saveAndFlush(user);
            return user;
        }
        return null;
    }
}
