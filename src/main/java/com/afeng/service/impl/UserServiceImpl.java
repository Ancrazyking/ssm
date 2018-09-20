package com.afeng.service.impl;


import com.afeng.mapper.UserMapper;
import com.afeng.pojo.User;
import com.afeng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author afeng
 * @date 2018/9/20 15:00
 **/
@Service("userServiceImpl")
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserMapper userMapper;

    @Override
    public void insertUser(User user)
    {
        userMapper.insertUser(user);
    }

    @Override
    public void deleteUser(Integer id)
    {
        userMapper.deleteUser(id);
    }

    @Override
    public void updateUser(User user)
    {
        userMapper.updateUser(user);
    }

    @Override
    public User queryUser(Integer id)
    {
        User user = userMapper.queryUser(id);
        return user;
    }

    @Override
    public List<User> queryAllUser()
    {
        return userMapper.queryAllUser();
    }
}
