package com.lm.mapper;

import com.lm.pojo.Student;
import com.lm.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author super
 */
public interface TeacherMapper {

    /**
     * 获取老师信息
     * @param tid
     * @return
     */
    List<Teacher> getTeacherList();

    List<Teacher> getTeacherList2(@Param("tid") int id);

}
