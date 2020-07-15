package com.lm.mapper;

import com.lm.pojo.User;
import com.lm.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {


    @Test
    public void test() {
        //获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user.getName());
        }
        sqlSession.close();
    }
}
