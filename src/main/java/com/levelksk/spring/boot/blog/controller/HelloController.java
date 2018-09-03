package com.levelksk.spring.boot.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 等价于 @Controller、@ResponseBody的组合，返回在RESTful应用常用的json格式数据
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World! Welcome to visit levelksk.com!";
    }

}
