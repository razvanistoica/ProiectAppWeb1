package com.db.paw.DAO.impl;

import com.db.paw.DAO.UserDAO;
import com.db.paw.entities.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

/**
 * Created with IntelliJ IDEA.
 * User: Razvan
 * Date: 3/27/16
 * Time: 11:28 PM
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public void insertUser(User user) {
        try{
        sessionFactory.getCurrentSession().saveOrUpdate(user);
        }catch(Error e){
            System.out.
        }
    }
}
