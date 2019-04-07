package com.yaowang.springboottest.service.impl;

import com.yaowang.springboottest.entity.User;
import com.yaowang.springboottest.mapper.UserMapper;
import com.yaowang.springboottest.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Author
 * @since 2019-04-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public boolean addUser(User user) {
        return this.save(user);
    }
}
