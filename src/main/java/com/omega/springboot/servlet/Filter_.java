package com.omega.springboot.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Class Filter_
 *
 * @author KennySo
 * @date 2024/10/16
 */

@WebFilter({"/css/*", "/image/**"})
public class Filter_ implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter_ init()...");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter_ doFilter()...");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("Filter_ destroy()...");
    }
}
