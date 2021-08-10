package org.example.exception;

import lombok.Getter;

@Getter
public class AppException extends RuntimeException {

    private String code;

    public AppException(String code, String message) {
        super(message);
        this.code = code;
    }

    public AppException(String code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }
}
