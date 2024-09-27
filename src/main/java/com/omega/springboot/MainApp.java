package com.omega.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


/**
 * Class MainApp
 *
 * @author KennySo
 * @date 2024/9/27
 */
@ComponentScan(value = "com.omega")
@SpringBootApplication
public class MainApp {

    // SpringBoot 程序启动入口
    public static void main(String[] args) {
        ApplicationContext ioc = SpringApplication.run(MainApp.class, args);
        // String[] beanDefinitionNames = ioc.getBeanDefinitionNames();
        // for (String beanDefinitionName : beanDefinitionNames) {
        //     // 搜索 OuterComponent 可以找到
        //     System.out.println(beanDefinitionName);
        // }

        System.out.println("IOC 容器中是否存在 dog : " + ioc.containsBean("dog"));
    }
}
