package com.yaowang.springboottest.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.yaowang.springboottest.entity.User;
import com.yaowang.springboottest.mapper.UserMapper;
import com.yaowang.springboottest.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public boolean deletebyName(String name) {
        Wrapper deleteWrapper = new UpdateWrapper<User>().lambda().eq(User::getName, name);
        return this.remove(deleteWrapper);
    }

    @Override
    public boolean update(long id, User user) {
        Wrapper updateWrapper = new UpdateWrapper<User>().lambda()
                .eq(User::getId,id);
        return this.update(user,updateWrapper);
    }

    @Override
    public List<User> queryAll() {
        return this.list();
    }
}
