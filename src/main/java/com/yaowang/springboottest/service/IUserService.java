package com.yaowang.springboottest.service;

import com.yaowang.springboottest.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Author
 * @since 2019-04-07
 */
public interface IUserService extends IService<User> {

    boolean addUser(User user);

}
