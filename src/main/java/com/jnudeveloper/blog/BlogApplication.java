package com.jnudeveloper.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.jnudeveloper.blog.server.ThriftServer;

@SpringBootApplication
public class BlogApplication {

	public static void main(String[] args) {
		App.container = SpringApplication.run(BlogApplication.class, args);
		try {
			ThriftServer thriftServer = App.container.getBean(ThriftServer.class);
			thriftServer.start();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
