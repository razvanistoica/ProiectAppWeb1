package com.db.paw.service.impl;

import com.db.paw.DAO.UserDAO;
import com.db.paw.entities.User;
import com.db.paw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: Razvan
 * Date: 3/27/16
 * Time: 11:40 PM
 * To change this template use File | Settings | File Templates.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public void insertUser(User user) {
        userDAO.insertUser(user);
    }
}
