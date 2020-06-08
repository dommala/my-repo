package com.org.complex.object.exception;

public class DataNotFound extends RuntimeException {

    public DataNotFound(String message) {
        super(message);
    }

    public DataNotFound(String message, Throwable cause) {
        super(message, cause);
    }
}
