package com.omega.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Class IndexController
 *
 * @author KennySo
 * @date 2024/10/11
 */
@Controller
public class IndexController {

    @RequestMapping({"/", "/login"})
    public String login() {
        /*
           引入了 spring-boot-starter-thymeleaf 后, 会自动配置对应的视图解析器.
           (不受原先静态资源 默认路径 和 前缀 的影响)
         */
        return "admin_login";
    }
}
