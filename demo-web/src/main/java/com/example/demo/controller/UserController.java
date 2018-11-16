package com.example.demo.controller;/**
 * Created by renjp on 2018/11/16.
 */

import com.example.demo.bean.User;
import com.example.demo.result.Result;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author renjp
 * @Date 2018/11/16 17:53
 * @Version 1.0
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("list")
    public Result<List<User>> selectAll() {

        List<User> users = userService.listUser();
        return Result.success(users);
    }
}
