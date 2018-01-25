package com.jnudeveloper.blog.controller;

import com.jnudeveloper.blog.App;
import com.jnudeveloper.blog.thriftgen.domain.Request;
import com.jnudeveloper.blog.thriftgen.domain.Response;
import org.springframework.stereotype.Controller;

@Controller
public class BaseController {

    /**
     * 检验请求的有效性
     * */
    public boolean validateRequest(Request req){
        //TODO 记录日志
        //判断appId和appKey的有效性
        String appKey = App.clientParams.get(req.appId);
        if(appKey.equals(req.appKey)){
            return true;
        }
        return false;
    }

    public Response getResponseOfInvalidRequest(){
        Response response = new Response();
        //TODO 此处的code需要统一
        response.code = 1;//无效请求
        response.msg = "invalid request";
        response.data = null;
        return response;
    }
}
