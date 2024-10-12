package com.omega.springboot.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Class LoginInterceptor
 *
 * @author KennySo
 * @date 2024/10/12
 */
@Slf4j
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String requestURI = request.getRequestURI();
        log.info("LoginInterceptor 拦截到的 URI={}", requestURI);

        // 验证 Session 中是否存有客户信息
        if (request.getSession().getAttribute("admin") != null) {
            // 放行
            return true;
        }
        request.setAttribute("msg", "您尚未登录/请登录");
        request.getRequestDispatcher("/").forward(request, response);
        return false;
    }
}
