package com.omega.springboot.controller;

import com.omega.springboot.entity.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Class YamlController
 *
 * @author KennySo
 * @date 2024/9/28
 */
@RestController
@RequestMapping("/yaml")
public class YamlController {

    @Resource
    private Student student;

    @RequestMapping("/get")
    public Student getStudent() {
        return student;
    }
}
