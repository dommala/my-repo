package com.org.complex.object.exception;

import org.springframework.http.HttpStatus;

public class ExceptionDetails {
    private final String msg;
    private final HttpStatus  httpStatus;

    public ExceptionDetails(String msg, HttpStatus httpStatus) {
        this.msg = msg;
        this.httpStatus = httpStatus;
    }

    public String getMsg() {
        return msg;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
