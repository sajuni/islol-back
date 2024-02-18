package com.example.islolback.common.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class BizException extends RuntimeException {

    private final String msg;
    private HttpStatus httpStatus;

    public BizException(String msg) {
        this.msg = msg;
        this.httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
    }

    public BizException(String message, HttpStatus httpStatus) {
        this(message);
        this.httpStatus = httpStatus;
    }

    @Override
    public String getMessage() {
        return msg;
    }
}
