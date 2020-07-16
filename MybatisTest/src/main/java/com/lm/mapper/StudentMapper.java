package com.lm.mapper;

import com.lm.pojo.Student;
import com.lm.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author super
 */
public interface StudentMapper {

    /**
     * 获取学生列表
     * @return
     */
    List<Student> getStudentList();

    /**
     * 获取对应的老师（对象）
     * @param id
     * @return
     */
    Teacher getTeacher(@Param("id") int id);
}
