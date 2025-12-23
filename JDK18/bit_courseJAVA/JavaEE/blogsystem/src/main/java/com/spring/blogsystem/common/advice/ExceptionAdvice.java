package com.spring.blogsystem.common.advice;


import com.spring.blogsystem.common.exception.BlogException;
import com.spring.blogsystem.pojo.response.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@ResponseBody
@ControllerAdvice
public class ExceptionAdvice {

    public Result exceptionHandler(Exception e) {
        log.error("【系统异常】{}", e);
        return Result.fail(e.getMessage(), null);
    }

    public Result blogExceptionHandler(BlogException e) {
        log.error("【系统异常】{}", e);
        return Result.fail(e.getMessage(), null);
    }
}
