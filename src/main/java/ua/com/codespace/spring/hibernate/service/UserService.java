package ua.com.codespace.spring.hibernate.service;

import ua.com.codespace.spring.hibernate.dao.UserDao;
import ua.com.codespace.spring.hibernate.model.User;

public class UserService {

    private UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public User getUser(int id) {
        return userDao.getUser(id);
    }

    public void addUser(User user) {
        userDao.save(user);
    }
}
