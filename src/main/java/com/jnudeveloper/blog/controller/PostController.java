package com.jnudeveloper.blog.controller;

import com.jnudeveloper.blog.action.post.FindAllAction;
import com.jnudeveloper.blog.action.post.FindByIdAction;
import com.jnudeveloper.blog.thriftgen.domain.Request;
import com.jnudeveloper.blog.thriftgen.domain.Response;
import com.jnudeveloper.blog.thriftgen.service.PostService;
import org.apache.thrift.TException;
import org.springframework.stereotype.Controller;

@Controller
public class PostController implements PostService.Iface{

    @Override
    public Response findById(Request req) throws TException {
        FindByIdAction action = new FindByIdAction();

        return action.run(req);
    }

    @Override
    public Response findAll(Request req) throws TException {
        FindAllAction action = new FindAllAction();

        return action.run(req);
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
