package org.java.exception;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public String handlerException(HttpServletRequest req, Exception ex){
        System.out.println("---------------进入异常处理类---------------");
        //获得异常原因
        String msg = ex.getMessage();
        System.out.println(msg);
        //存储异常原因
        req.setAttribute("err",msg);
        return "/err";
    }
}
