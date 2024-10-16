package com.omega.springboot.controller;

import com.omega.springboot.exception.AccessException;
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
    @RequestMapping("/err1")
    public String err1(@RequestParam String username) {
        System.out.println(username);
        return "redirect:/manage.html";
    }

    /**
     * 模拟 500 错误
     */
    @RequestMapping("/err2")
    public String err2() {
        int i = 10 / 0;
        return "redirect:/manage.html";
    }

    /**
     * 模拟自定义异常
     */
    @RequestMapping("/err3")
    public String err3(@RequestParam String username) {
        if (!"tom".equals(username)) {
            throw new AccessException();
        }
        return "redirect:/manage.html";
    }
}
