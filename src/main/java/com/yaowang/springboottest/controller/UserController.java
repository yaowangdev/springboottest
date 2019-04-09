package com.yaowang.springboottest.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Author
 * @since 2019-04-07
 */
@RestController
@RequestMapping("/springboottest/user")
public class UserController {
    
    
    @RequestMapping(value = "/regist",method = RequestMethod.GET)
    public String registUser(){

        return null;
    }

}
