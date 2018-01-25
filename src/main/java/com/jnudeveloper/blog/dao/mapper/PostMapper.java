package com.jnudeveloper.blog.dao.mapper;

import com.jnudeveloper.blog.domain.Post;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PostMapper {

    @Select(value="SELECT * FROM tbl_post WHERE id = #{id}")
    @Results(value={
            @Result(property = "createTime",  column = "create_time"),
            @Result(property = "updateTime", column = "update_time"),
            @Result(property = "authorId", column = "author_id"),
            @Result(property = "approveNum", column = "approve_num"),
            @Result(property = "collectNum", column = "collect_num"),
            @Result(property = "commentNum", column = "comment_num"),
    })
    Post findById(@Param(value="id") int id);

    @Select(value="SELECT * FROM tbl_post")
    @Results(value={
            @Result(property = "createTime",  column = "create_time"),
            @Result(property = "updateTime", column = "update_time"),
            @Result(property = "authorId", column = "author_id"),
            @Result(property = "approveNum", column = "approve_num"),
            @Result(property = "collectNum", column = "collect_num"),
            @Result(property = "commentNum", column = "comment_num"),
    })
    List<Post> findAll();
}
