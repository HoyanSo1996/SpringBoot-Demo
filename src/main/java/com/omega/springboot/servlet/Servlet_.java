package com.omega.springboot.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Class Servlet_
 *
 * @author KennySo
 * @date 2024/10/16
 */
// @WebServlet({"/servlet01", "/servlet02"})
public class Servlet_ extends HttpServlet {

    /**
     * Tips: 请求进入原生 Servlet 后, 就不会再进入 DispatcherServlet 那一套流程汇总
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("hello, Servlet_!");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
