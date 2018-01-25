package com.jnudeveloper.blog.action.post;

import com.alibaba.fastjson.JSON;
import com.jnudeveloper.blog.App;
import com.jnudeveloper.blog.action.BaseAction;
import com.jnudeveloper.blog.domain.Post;
import com.jnudeveloper.blog.dao.mapper.PostMapper;
import com.jnudeveloper.blog.thriftgen.domain.Request;
import com.jnudeveloper.blog.thriftgen.domain.Response;
import java.util.List;
import java.util.Map;

public class FindAllAction extends BaseAction {

    private PostMapper postMapper;

    public FindAllAction(){
        this.postMapper = (PostMapper) App.container.getBean("postMapper");
    }

    /**
     * 版本 0.0.1
     **/
    public Response v0_0_1(Request req){
        //TODO 检验请求的有效性
        Map request = JSON.parseObject(req.data);
        List<Post> posts = this.postMapper.findAll();

        Response response = new Response();
        response.code = 0;
        response.msg = "success";
        response.data = JSON.toJSONString(posts);

        return response;
    }
}
