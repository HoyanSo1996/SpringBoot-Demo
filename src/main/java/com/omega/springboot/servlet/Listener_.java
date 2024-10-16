package com.omega.springboot.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Class Listener_
 *
 * @author KennySo
 * @date 2024/10/16
 */
@WebListener
public class Listener_ implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Listener_ contextInitialized()...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Listener_ contextDestroyed()...");
    }
}
