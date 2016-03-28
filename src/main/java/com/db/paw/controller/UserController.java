package com.db.paw.controller;

import com.db.paw.entities.Shop;
import com.db.paw.entities.Status;
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
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/insert", method = RequestMethod.GET)

        public String insert(@RequestBody User user){

        try{
            userService.insertUser(new User("Jhon","gdfg","gdfsg","gdssg","dsfsdfg",new Shop(),new Status()));
            return "Operatia s-a efectuat cu succes";
        }catch(Error e){
            return "Userul nu a putut fi inregistrat";
        }
    }
}
