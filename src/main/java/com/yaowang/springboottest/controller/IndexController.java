package com.yaowang.springboottest.controller;


import com.yaowang.springboottest.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class IndexController {

    @RequestMapping(value = "/")
    public String index(){
        return "Hello Spring Booter";
    }


    @RequestMapping(value = "/demo1/{id}",method = RequestMethod.GET)
    public String demo1(@PathVariable(name = "id") String id){
        return "id="+id;
    }

    @RequestMapping(value = "/demo2",method = RequestMethod.POST)
    public String demo2(@RequestBody User user){
        return user.toString();
    }

    @RequestMapping(value = "/demo3",method = RequestMethod.POST)
    public String demo3(@RequestBody Map<String,String> map){
        return map.toString();
    }

    @RequestMapping(path = "/demo4",method = RequestMethod.POST)
    public String demo3(User user){
        return user.toString();
    }


}
