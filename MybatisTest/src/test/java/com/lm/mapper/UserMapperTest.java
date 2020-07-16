package com.lm.mapper;

import com.lm.pojo.User;
import com.lm.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class UserMapperTest {


    @Test
    public void testGetUserList() {
        try (SqlSession sqlSession = MybatisUtils.getSqlSession()) {
            //获取SqlSession对象
            List<User> userList = sqlSession.getMapper(UserMapper.class).getUserList();

            for (User user : userList) {
                System.out.println(user);
            }
        }


    }

    @Test
    public void testGetUserLike() {
        try(SqlSession sqlSession=MybatisUtils.getSqlSession()) {
            List<User> users = sqlSession.getMapper(UserMapper.class).getUserLike("李");
            for (User user : users) {
                System.out.println(user);
            }
        }
    }

    @Test
    public void testGetUserById() {
        try (SqlSession sqlSession =MybatisUtils.getSqlSession()){
            User user = sqlSession.getMapper(UserMapper.class).getUserById(2);
            System.out.println(user);
        }
    }

    //增删改需要提交事务
    @Test
    public void testAddUser() {
        try(SqlSession sqlSession =MybatisUtils.getSqlSession()) {
            sqlSession.getMapper(UserMapper.class).addUser(new User(4,"lm","74521"));
            sqlSession.commit();
        }
    }

    @Test
    public void testAddUserByMap() {
        try (SqlSession sqlSession = MybatisUtils.getSqlSession()){
            Map<String, Object> map = new HashMap<>();
            map.put("id",6);
            map.put("name","dy");
            map.put("pwd","123456789");
            sqlSession.getMapper(UserMapper.class).addUserByMap(map);
            sqlSession.commit();
        }
    }

    @Test
    public void testUpdateUser() {
        try(SqlSession sqlSession =MybatisUtils.getSqlSession()) {
            sqlSession.getMapper(UserMapper.class).updateUser(new User(1,"张三1","147258"));
            sqlSession.commit();
        }
    }

    @Test
    public void testDeleteUserById() {
        try(SqlSession sqlSession =MybatisUtils.getSqlSession()) {
            sqlSession.getMapper(UserMapper.class).deleteUserById(3);
            sqlSession.commit();
        }
    }

}


