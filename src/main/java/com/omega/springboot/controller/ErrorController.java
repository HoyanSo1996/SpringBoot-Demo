package com.omega.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Class ErrorController
 *
 * @author KennySo
 * @date 2024/10/16
 */
@Controller
public class ErrorController {

    /**
     * 模拟 400 异常
     * 直接请求 /SpringBoot-Demo/err, 不带参数
     */
    @RequestMapping("err1")
    public String err1(@RequestParam String username) {
        System.out.println(username);
        return "manage.html";
    }

    /**
     * 模拟 500 错误
     */
    @RequestMapping("err2")
    public String err2() {
        int i = 10 / 0;
        return "manage.html";
    }
}
