package com.jnudeveloper.blog.controller;


import com.jnudeveloper.blog.mapper.PostMapper;
import com.jnudeveloper.blog.thriftgen.domain.Request;
import com.jnudeveloper.blog.thriftgen.domain.Response;
import com.jnudeveloper.blog.thriftgen.service.PostService;
import org.apache.thrift.TException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.jnudeveloper.blog.domain.Post;

@Controller
public class PostController implements PostService.Iface{
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PostMapper postMapper;

    @Override
    public Response findById(Request req) throws TException {
        System.out.println("connect");

        Map request = JSON.parseObject(req.data);

        Post post = postMapper.findById((int )request.get("id"));

        Response response = new Response();
        response.code = 0;
        response.msg = null;
        response.data = JSON.toJSONString(post);
        return response;
    }

    @Override
    public Response findAll(Request req) throws TException {
//        List<Post> posts = postMapper.findAll();
//        return Post.format(posts);
        return null;
    }

    @Override
    public Response create(Request req) throws TException {
        return null;
    }

    @Override
    public Response createWithTags(Request req) throws TException {
        return null;
    }

    @Override
    public Response update(Request req) throws TException {
        return null;
    }

    @Override
    public Response updateWithTags(Request req) throws TException {
        return null;
    }

    @Override
    public Response deleteById(Request req) throws TException {
        return null;
    }

    @Override
    public int ping(int seq) throws TException {
        return 0;
    }
}
