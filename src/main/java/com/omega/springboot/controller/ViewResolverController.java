package com.omega.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Class ViewResolverController
 *
 * @author KennySo
 * @date 2024/10/8
 */
@Controller
public class ViewResolverController {

    // @RequestMapping("hello.html")
    @ResponseBody
    public String hello() {
        return "hello, handler~";
    }

    /**
     * 未配置视图解析器时, 进行测试
     */
    @RequestMapping("/go")
    public String go() {
        /*
            先查看是否配置了视图解析器
           (1) 如果配置了, 就使用视图解析器进行解析.
           (2) 如果没配置, 根据路径匹配的顺序.
           (2.1) 先看 Controller 中有没有 /hello.html 的处理器
           (2.2) 进入 defaultServlet 查找名为 hello.html 的静态资源（要注释掉 static-path-pattern）.
         */
        return "hello.html";
    }

    /**
     * 配置视图解析器后, 进行测试
     */
    @RequestMapping("/go2")
    public String go2() {
        return "hello2";
    }
}