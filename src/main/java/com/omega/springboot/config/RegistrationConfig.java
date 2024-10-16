package com.omega.springboot.config;

import com.omega.springboot.servlet.Filter_;
import com.omega.springboot.servlet.Listener_;
import com.omega.springboot.servlet.Servlet_;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.RegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import java.util.Arrays;

/**
 * Class RegistrationConfig
 *
 * @author KennySo
 * @date 2024/10/16
 */
@Configuration
public class RegistrationConfig {

    /**
     * 注入 Servlet
     */
    @Bean
    public ServletRegistrationBean servlet_() {
        return new ServletRegistrationBean(new Servlet_(), "/servlet01", "/servlet02");
    }

    /**
     * 注入 Servlet
     */
    @Bean
    public FilterRegistrationBean filter_() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean<>(new Filter_());
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/css/*", "/image/**"));
        return filterRegistrationBean;
    }

    /**
     * 注入 Listener
     */
    @Bean
    public ServletListenerRegistrationBean listener_() {
        return new ServletListenerRegistrationBean(new Listener_());
    }
}
