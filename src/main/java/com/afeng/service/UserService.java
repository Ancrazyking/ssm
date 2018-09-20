package com.afeng.service;

import com.afeng.pojo.User;

import java.util.List;

/**
 * @author afeng
 * @date 2018/9/20 15:00
 **/
public interface UserService
{
    /**
     * 插入用户
     *
     * @param user
     */
    void insertUser(User user);

    /**
     * 删除用户
     *
     * @param id
     */
    void deleteUser(Integer id);

    /**
     * 修改用户
     *
     * @param user
     */
    void updateUser(User user);

    /**
     * 通过id查询单个用户
     *
     * @param id
     * @return
     */
    User queryUser(Integer id);

    /**
     * 查询所有用户
     *
     * @return
     */
    List<User> queryAllUser();
}
