package com.yaowang.springboottest.service;


import com.yaowang.springboottest.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {


    @Autowired
    private IUserService userService;

    @Test
    public void registUser() {
        User user = new User();
        user.setName("Tom");
        user.setAge(34);
        user.setGender("男");
        user.setJob("程序员");
        userService.addUser(user);
    }
}
