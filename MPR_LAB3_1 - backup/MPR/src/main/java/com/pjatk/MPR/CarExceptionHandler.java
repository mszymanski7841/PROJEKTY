package com.pjatk.MPR;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CarExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(CarNotFoundException.class)
        protected ResponseEntity<Object> handleNotFound (RuntimeException ex, WebRequest request){
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
        }


}
