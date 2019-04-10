package com.yaowang.springboottest.controller;


import com.yaowang.springboottest.entity.Result;
import com.yaowang.springboottest.entity.User;
import com.yaowang.springboottest.service.IUserService;
import com.yaowang.springboottest.util.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/regist",method = RequestMethod.POST)
    public Result registUser(User user){
        boolean flag = userService.addUser(user);
        Result result = new Result();
        if(flag){
            result.setSuccess(true);
            result.setMessage("注册成功");
            result.setCode(0);
        }else {
            result.setMessage("注册失败");
            result.setSuccess(false);
        }
        return result;
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public Result deleteByName(@RequestParam(name = "name") String name){
        boolean flag = userService.deletebyName(name);
        Result result = new Result();
        if(flag){
            result.setSuccess(true);
            result.setMessage("删除成功");
            result.setCode(0);
        }else {
            result.setMessage("删除失败");
            result.setSuccess(false);
        }
        return result;
    }

    @RequestMapping(value = "/modify",method = RequestMethod.POST)
    public Result update(User user){
        boolean flag = userService.update(user.getId(),user);
        Result result = new Result();
        if(flag){
            result.setSuccess(true);
            result.setMessage("更新成功");
            result.setCode(0);
        }else {
            result.setMessage("更新失败");
            result.setSuccess(false);
        }
        return result;
    }

    @RequestMapping(value = "/queryAll",method = RequestMethod.GET)
    public Result queryAll(){
        List<User> users = userService.queryAll();
        Result result = new Result();
        result.setCode(0);
        result.setMessage("查询成功");
        result.setResult(users);
        result.setSuccess(true);
        return result;
    }
}
