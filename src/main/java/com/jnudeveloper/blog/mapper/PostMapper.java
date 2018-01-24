package com.jnudeveloper.blog.mapper;

import com.jnudeveloper.blog.domain.Post;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PostMapper {

    @Select("SELECT * FROM tbl_post WHERE id = #{id}")
    @Results({
            @Result(property = "createTime",  column = "create_time"),
            @Result(property = "updateTime", column = "update_time"),
            @Result(property = "authorId", column = "author_id"),
            @Result(property = "approveNum", column = "approve_num"),
            @Result(property = "collectNum", column = "collect_num"),
            @Result(property = "commentNum", column = "comment_num"),
    })
    Post findById(@Param("id") int id);

    @Select("SELECT * FROM tbl_post")
    @Results({
            @Result(property = "createTime",  column = "create_time"),
            @Result(property = "updateTime", column = "update_time"),
            @Result(property = "authorId", column = "author_id"),
            @Result(property = "approveNum", column = "approve_num"),
            @Result(property = "collectNum", column = "collect_num"),
            @Result(property = "commentNum", column = "comment_num"),
    })
    List<Post> findAll();
}
