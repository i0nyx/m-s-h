package by.onyx.common.service;


import by.onyx.common.pojo.User;

import java.util.List;

public interface UserData {

    List<User> getAllUser();

    User save(User user);
}
