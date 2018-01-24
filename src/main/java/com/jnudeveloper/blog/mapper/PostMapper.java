package com.jnudeveloper.blog.mapper;

import com.jnudeveloper.blog.domain.Post;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PostMapper {

    @Select("SELECT * FROM tbl_post WHERE id = #{id}")
    Post findById(@Param("id") int id);
}
