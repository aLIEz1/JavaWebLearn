package com.lm.mapper;

import com.lm.pojo.Student;
import com.lm.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

class StudentMapperTest {
    @Test
    void testGetStudentList() {
        try (SqlSession sqlSession = MybatisUtils.getSqlSession()) {
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            List<Student> students = mapper.getStudentList();
            for (Student student : students) {
                System.out.println(student);
            }

        }
    }

    @Test
    void testGetTeacher() {
        try (SqlSession sqlSession =MybatisUtils.getSqlSession()){
            System.out.println(sqlSession.getMapper(StudentMapper.class).getTeacher(1));
        }
    }
}
