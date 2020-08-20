package com.example.lmc.interceptor;

import com.example.lmc.exception.CustomException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author lmc
 * @date 2020/7/31 23:43
 */
@ControllerAdvice
@Slf4j
public class ControllerAdviceDemo {

    @ExceptionHandler(value = Exception.class)
    public void errorHandler(Exception ex) {
        System.out.println("系统异常");
        log.info("系统异常", ex);
    }

    /**
     * 拦截捕捉自定义异常 CustomException.class
     * @param ex
     * @return
     */
    @ExceptionHandler(value = CustomException.class)
    public void customErrorHandler(CustomException ex) {
        System.out.println("自定义异常");
        log.info("自定义异常", ex);
    }

}
