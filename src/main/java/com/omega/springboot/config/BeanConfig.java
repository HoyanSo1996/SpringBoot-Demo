package com.omega.springboot.config;

import com.omega.springboot.entity.Cat;
import com.omega.springboot.entity.Dog;
import com.omega.springboot.entity.Monster3;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Class BeanConfig
 *
 * @author KennySo
 * @date 2024/9/27
 */
@Configuration
@EnableConfigurationProperties(Monster3.class)
public class BeanConfig {

    /**
     * 通过开关闭注释来进行测试
     * Tips: 在 BeanConfig 中, Bean 是按从上到下的顺序注入到 IOC 容器的.
     */
    @Bean("cat")
    public Cat getCat() {
        return new Cat();
    }

    @Bean("dog")
    @ConditionalOnBean(name = "cat")
    public Dog getDog() {
        return new Dog();
    }
}