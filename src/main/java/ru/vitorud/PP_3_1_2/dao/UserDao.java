package ru.vitorud.PP_3_1_2.dao;


import ru.vitorud.PP_3_1_2.model.User;

import java.util.List;

public interface UserDao {
    void createUser(User user);
    List<User> userList();
    User getOneUser(int id);
    void deleteUser(int id);
    void updateUser(User user);
}
