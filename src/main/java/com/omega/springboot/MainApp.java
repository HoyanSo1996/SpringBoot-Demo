package com.omega.springboot;

import com.omega.springboot.entity.Monster;
import com.omega.springboot.entity.Monster2;
import com.omega.springboot.entity.Monster3;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;


/**
 * Class MainApp
 *
 * @author KennySo
 * @date 2024/9/27
 */
// @ServletComponentScan("com.omega")
@ComponentScan(value = "com.omega")
@SpringBootApplication
public class MainApp {

    // SpringBoot 程序启动入口
    public static void main(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(MainApp.class, args);
        // String[] beanDefinitionNames = ioc.getBeanDefinitionNames();
        // for (String beanDefinitionName : beanDefinitionNames) {
        //     // 搜索 OuterComponent 可以找到
        //     System.out.println(beanDefinitionName);
        // }

        // System.out.println("IOC 容器中是否存在 dog : " + ioc.containsBean("dog"));

        // Monster monster = ioc.getBean( Monster.class);
        // Monster2 monster2 = ioc.getBean(Monster2.class);
        // Monster3 monster3 = ioc.getBean( Monster3.class);
        // System.out.println(monster);
        // System.out.println(monster2);
        // System.out.println(monster3);

        // 如果需要测试到 Filter 的 destroy() 和 Listener 的 contextDestroyed(), 就要放开 stop().
        //ioc.stop();
    }
}
