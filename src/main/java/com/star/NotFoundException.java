package com.star;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @Description: 自定义异常
 * @Author: 转角的微笑
 * @Date: Created in 16:03 2020/3/25
 * @QQ群: 530311074
 * @URL: https://转角的微笑.newstar.net.cn/
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException{
    public NotFoundException() {
    }

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}