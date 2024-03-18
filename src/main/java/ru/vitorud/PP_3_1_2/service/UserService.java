package ru.vitorud.PP_3_1_2.service;


import ru.vitorud.PP_3_1_2.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    void removeUser(int id);
    List<User> userList();
    User getOneUser(int id);
    void updateUser(User user);
}
