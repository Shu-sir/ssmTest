package com.test.service;

import com.test.dao.UserDao;
import com.test.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> getUser(){
        List<User> users = this.userDao.selectUser();
        return users;
    }
}
