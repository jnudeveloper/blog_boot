package com.jnudeveloper.blog;

import org.springframework.context.ApplicationContext;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static ApplicationContext container = null;

    public static Map<Integer, String> clientParams = new HashMap<Integer, String>(){{
        put(0, "console-key");
    }};
}
