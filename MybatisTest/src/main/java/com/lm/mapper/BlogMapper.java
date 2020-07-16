package com.lm.mapper;

import com.lm.pojo.Blog;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    /**
     * 增加blog
     * @param blog 返回一个博客
     */
    void addBlog(Blog blog);

    /**
     * 用if查询Blog
     * @param map 参数为map
     * @return List
     */
    List<Blog> queryBlogIf(Map<String,Object> map);
}
