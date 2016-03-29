package com.db.paw.controller;


import com.db.paw.entities.DepartmentStore;
import com.db.paw.entities.User;
import com.db.paw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: Razvan
 * Date: 3/27/16
 * Time: 11:49 PM
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/insert", method = RequestMethod.POST)

        public String insert(@RequestBody User user){

        try{
            userService.insertUser(user);
            return "Operatia s-a efectuat cu succes";
        }catch(Error e){
            return "Userul nu a putut fi inregistrat";
        }
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)

    public String getUser(){
        return "test";
    }

    @RequestMapping(value = "/insertuser", method = RequestMethod.POST)

    public String getUserNou(){

        try{
            userService.insertUser(new User("lala","jhvfhb","789","kjhgfkjd","kfbdk",new DepartmentStore(), User.Role.ADMIN));
            return "Operatia s-a efectuat cu succes";
        }catch(Error e){
            return "Userul nu a putut fi inregistrat";
        }
    }
}
