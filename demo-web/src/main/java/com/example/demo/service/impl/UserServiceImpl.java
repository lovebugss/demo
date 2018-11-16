package com.example.demo.service.impl;/**
 * Created by renjp on 2018/11/16.
 */

import com.example.demo.bean.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author renjp
 * @Date 2018/11/16 17:51
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> listUser() {
        return userMapper.selectAll();
    }
}
