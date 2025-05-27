package com.sonat.customerapi.controller.error;

import java.util.Objects;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<CustomerError> handleException(MethodArgumentNotValidException ex) {
        log.atError().log(ex.getMessage(), ex.getCause());
        return new ResponseEntity<>(CustomerError.builder().code(ErrorCode.CUSTOMER_INVALID_REQUEST)
                .message(Objects.requireNonNull(ex.getFieldError()).getDefaultMessage()).build(),
                HttpStatus.BAD_REQUEST);
    }

}
