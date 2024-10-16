package com.omega.springboot.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.HandlerMethod;

/**
 * Class GlobalExceptionHandler
 *
 * @author KennySo
 * @date 2024/10/16
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    /**
     * Exception e: 表示异常发生后, 传递的异常对象
     * Model model: 可以将异常信息, 放入model, 然后交给前端显示；
     *              但要注意的是, 这里走的不在是默认异常处理机制,
     *              因此默认异常处理机制中封装的异常信息不在出现在这里
     * HandlerMethod handlerMethod: 出现异常的方法
     */
    @ExceptionHandler({ArithmeticException.class, NullPointerException.class})
    public String handler1(Exception e, Model model, HandlerMethod handlerMethod) {
        log.info("异常信息={}", e.getMessage());
        log.info("异常方法={}", handlerMethod.getMethod());
        // 这里可以将后端发生的异常信息显示在前端
        model.addAttribute("msg", e.getMessage());
        return "/error/global";
    }
}
