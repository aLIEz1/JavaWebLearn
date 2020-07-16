package com.lm.mapper;

import com.lm.pojo.Blog;
import com.lm.utils.IdUtils;
import com.lm.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class BlogMapperTest {

    @Test
    void testAddBlog() {
        try (SqlSession sqlSession = MybatisUtils.getSqlSession()){
            BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
            Blog blog = new Blog();
            blog.setId(IdUtils.getId());
            blog.setTitle("Mybatis");
            blog.setAuthor("lm");
            blog.setCreateTime(new Date());
            blog.setViews(999);
            mapper.addBlog(blog);
            blog.setId(IdUtils.getId());
            blog.setTitle("Java");
            mapper.addBlog(blog);
            blog.setId(IdUtils.getId());
            blog.setTitle("Spring");
            mapper.addBlog(blog);
            blog.setId(IdUtils.getId());
            blog.setTitle("SpringBoot");
            mapper.addBlog(blog);
        }
    }
}