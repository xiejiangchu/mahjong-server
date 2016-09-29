package com.xie.mj.controller;

import com.xie.mj.model.User;
import com.xie.mj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xie on 16/8/25.
 */
@Controller
public class HelloController {


    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/hello")
    public User userIndex() {
        return userService.getFirstUser();
    }
}
