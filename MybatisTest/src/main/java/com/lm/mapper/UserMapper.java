package com.lm.mapper;

import com.lm.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author super
 */
public interface UserMapper {

    /**
     * 获取用户列表
     * @return List<User>
     */
    List<User> getUserList();

    /**
     * 模糊查询
     * @param value
     * @return
     */
    List<User> getUserLike(String value);

    /**
     * 通过id查找用户
     * @param id
     * @return User
     */
    User getUserById(int id);

    /**
     * 添加用户
     * @param user
     */
    void addUser(User user);

    /**
     * 用map传递参数
     * @param map
     */
    void addUserByMap(Map<String,Object> map);

    /**
     * 更改用户信息
     * @param user
     */
    void updateUser(User user);

    /**
     * 删除用户
     * @param id
     */
    void deleteUserById(int id);
}
