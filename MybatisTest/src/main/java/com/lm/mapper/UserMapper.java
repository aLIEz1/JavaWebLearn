package com.lm.mapper;

import com.lm.pojo.User;

import java.util.List;

/**
 * @author super
 */
public interface UserMapper {

    /**
     * 获取用户列表
     * @return List<User>
     */
    List<User> getUserList();
}
