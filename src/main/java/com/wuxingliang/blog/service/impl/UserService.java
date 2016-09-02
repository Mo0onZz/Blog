package com.wuxingliang.blog.service.impl;

import com.wuxingliang.blog.mapper.UserMapper;
import com.wuxingliang.blog.pojo.User;
import com.wuxingliang.blog.service.IUserService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by wu on 2016/8/26.
 */
@Component
public class UserService implements IUserService {
    @Resource
    private UserMapper userMapper;

    public User getUserById(int userId) {
        return this.userMapper.selectByPrimaryKey(userId);
    }
}
