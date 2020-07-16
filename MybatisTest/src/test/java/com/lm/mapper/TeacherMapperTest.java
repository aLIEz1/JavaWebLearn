package com.lm.mapper;

import com.lm.pojo.Teacher;
import com.lm.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

class TeacherMapperTest {
    @Test
    void testGetTeacherList() {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession()){
            System.out.println(sqlSession.getMapper(TeacherMapper.class).getTeacherList2(1));
        }
    }
}
