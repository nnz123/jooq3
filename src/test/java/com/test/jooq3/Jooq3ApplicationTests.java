package com.test.jooq3;

import com.generator.tables.pojos.User;
import com.test.jooq3.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.xml.ws.Service;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Jooq3ApplicationTests {

    @Autowired
    UserService userService;
    @Test
    public void contextLoads() {
        System.out.println(userService.get());
    }

    @Test
    public void testInsert(){
        User user = new User();
        user.setUserName("ll");
        user.setUserAge(30);
        user.setId(20);
        userService.insert(user);

    }

    @Test
    public void testUpdate(){
        User user = new User();
        user.setUserName("uu");
        user.setUserAge(30);
        user.setId(7);
        userService.update(user);
    }

}
