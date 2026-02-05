package com.sabrinaweb.desafio_itau.controllers.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;

@ControllerAdvice
public class ControllerExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity badRequest(){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity transactionNotExcepted(){
        return ResponseEntity.status(422).build();
    }
}
