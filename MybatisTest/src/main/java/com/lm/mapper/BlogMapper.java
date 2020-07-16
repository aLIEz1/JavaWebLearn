package com.lm.mapper;

import com.lm.pojo.Blog;
import org.apache.ibatis.annotations.Param;

public interface BlogMapper {
    /**
     * 增加blog
     * @param blog
     */
    void addBlog(Blog blog);
}
