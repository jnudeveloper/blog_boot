package com.jnudeveloper.blog;

import com.jnudeveloper.blog.controller.PostController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.jnudeveloper.blog.server.ThriftServer;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BlogApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BlogApplication.class, args);
		try {
			ThriftServer thriftServer = context.getBean(ThriftServer.class);
			thriftServer.start();
		} catch (Exception e) {
			e.printStackTrace();
		}


//		try {
//			PostController postController = context.getBean(PostController.class);
//			TPost tPost = postController.findById(2);
//		} catch (Exception e){
//			e.printStackTrace();
//		}

	}
}
