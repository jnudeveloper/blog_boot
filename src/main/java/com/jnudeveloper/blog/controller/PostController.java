package com.jnudeveloper.blog.controller;

import com.jnudeveloper.blog.entity.PostEntity;
import com.jnudeveloper.blog.mapper.PostMapper;
import com.jnudeveloper.blog.thriftgen.domain.TCUDResult;
import com.jnudeveloper.blog.thriftgen.domain.TPost;
import com.jnudeveloper.blog.thriftgen.domain.TQuery;
import com.jnudeveloper.blog.thriftgen.domain.TTag;
import com.jnudeveloper.blog.thriftgen.service.PostService;
import org.apache.thrift.TException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import java.util.List;

import com.jnudeveloper.blog.domain.Post;

@Controller
public class PostController implements PostService.Iface{
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PostMapper postMapper;

    @Override
    public TPost findById(int id) throws TException {
        System.out.println("connect");
        Post post = postMapper.findById(id);
        return Post.format(post);
    }

    @Override
    public List<TPost> find(TQuery tQuery) throws TException {
//        System.out.println("where : " + tQuery.where);
//
//        Query query = new Query(tQuery);
//        Post post = new Post();
//        return Post.format(post.find(query));
        return null;
    }

    @Override
    public List<TPost> findAll() throws TException {
        return null;
    }

    @Override
    public TCUDResult create(TPost post) throws TException {
        return null;
    }

    @Override
    public TCUDResult createWithTags(TPost post, List<TTag> tagList) throws TException {
        return null;
    }

    @Override
    public TCUDResult update(TPost post) throws TException {
        return null;
    }

    @Override
    public TCUDResult updateWithTags(TPost post, List<TTag> tagList) throws TException {
        return null;
    }

    @Override
    public TCUDResult deleteById(int id) throws TException {
        return null;
    }
}
