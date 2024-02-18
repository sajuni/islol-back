package com.example.islolback.common.exception;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
public class GlobalExceptionHandler {

    @ExceptionHandler(BizException.class)
    public ResponseEntity<Object> handleCustomException(HttpServletResponse res, BizException ex) throws IOException {
        Map<String, String> map = new HashMap<>();
        map.put("message", ex.getMessage());
        return new ResponseEntity<>(map, HttpStatus.UNAUTHORIZED);
    }

}
