package com.omega.springboot.config;

import com.omega.springboot.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Class SpringMvcConfig
 *
 * @author KennySo
 * @date 2024/10/12
 */
@Configuration
public class SpringMvcConfig /* implements WebMvcConfigurer */ {

    /**
     * 注册拦截器 方式一
     */
    // @Override
    // public void addInterceptors(InterceptorRegistry registry) {
    //     registry.addInterceptor(new LoginInterceptor())
    //             .addPathPatterns("/**")  // 拦截所有请求
    //             .excludePathPatterns("/", "/login");  // 里面还需要添加 图片、css、js 等静态文件的文件夹.(静态资源的默认存放文件夹名不用写, 但子文件夹名需要)
    // }

    /**
     * 注册拦截器 方式二
     */
    // @Bean
    // public WebMvcConfigurer webMvcConfigurer() {
    //     return new WebMvcConfigurer() {
    //         @Override
    //         public void addInterceptors(InterceptorRegistry registry) {
    //             registry.addInterceptor(new LoginInterceptor())
    //                     .addPathPatterns("/**")
    //                     .excludePathPatterns("/", "/login");
    //         }
    //     };
    // }
}
