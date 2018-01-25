package com.jnudeveloper.blog.action;

import com.jnudeveloper.blog.thriftgen.domain.Request;
import com.jnudeveloper.blog.thriftgen.domain.Response;
import org.springframework.stereotype.Controller;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Controller
public class BaseAction {

    public Response run(Request req){
        String version = req.version;

        //version字符串替换（0.0.1 => 0_0_1）
        version = "v"+version.replace('.', '_');

        try{
            Method method = this.getClass().getMethod(version, Request.class);
            BaseAction object = this.getClass().newInstance();
            return (Response) method.invoke(object, req);

        } catch (NoSuchMethodException | IllegalAccessException |InvocationTargetException |InstantiationException e){
            return this.processException(e);
        }
    }

    protected Response processException(Exception e){
        //TODO 记录日志
        Response response = new Response();
        //TODO code需要再规划
        response.code = 1;//执行错误
        response.msg = e.getMessage();
        response.data = null;
        return response;
    }
}
