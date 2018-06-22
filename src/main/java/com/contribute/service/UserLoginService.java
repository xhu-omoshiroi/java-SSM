package com.contribute.service;

import com.contribute.entity.User;

import java.util.List;

/**
 * @Author: Lijie
 * @Date: 2018/6/19 16:44
 */
public interface UserLoginService {
    /**
     * 用户注册
     * @param user
     * @return
     */
    String userRegister(User user);

    /**
     * 用户登录
     * @param user
     * @return
     */
    boolean userLogin(User user);

    /**
     * 查看所有用户
     * @return
     */
    List<User> userQueryAll();
}