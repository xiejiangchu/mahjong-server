package com.xie.mj.service;

import com.xie.mj.mapper.UserMapper;
import com.xie.mj.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by xie on 16/8/25.
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Value("${test}")
    private String hello;

    public User getFirstUser() {
        return userMapper.selectByPrimaryKey(1);
    }

    public String getEnv() {
        return hello;
    }
}
