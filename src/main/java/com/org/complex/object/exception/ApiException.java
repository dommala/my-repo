package com.org.complex.object.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApiException {
    @ExceptionHandler(value = DataNotFound.class)
    public ResponseEntity<Object> handleApiExcep(DataNotFound e) {
        HttpStatus notFound = HttpStatus.NOT_FOUND;
        ExceptionDetails exceptionDetails = new ExceptionDetails(e.getMessage(), notFound);
        return new ResponseEntity<>(exceptionDetails, notFound);
    }
}
