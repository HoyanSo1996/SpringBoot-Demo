package com.omega.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class TestController
 *
 * @author KennySo
 * @date 2024/9/27
 */
@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping("/hi")
    public String hi() {
        return "hi, SpringBoot~";
    }
}
