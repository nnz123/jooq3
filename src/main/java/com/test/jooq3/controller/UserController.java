package com.test.jooq3.controller;

import com.generator.tables.pojos.User;
import com.test.jooq3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author nzhang
 */
@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/getAll",method = RequestMethod.GET)
    public List<User> get(){
        return userService.get();
    }
    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public User getById(@PathVariable("id") int id){
        return userService.getById(id);
    }
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public void delete(@PathVariable("id") int id){
        userService.delete(id);
    }

    @RequestMapping(value = "/insert",method = RequestMethod.GET)
    public void insert(User user){
        userService.insert(user);
    }
    @RequestMapping(value = "/update",method = RequestMethod.GET)
    public void update(User user){
        userService.update(user);
    }





}
