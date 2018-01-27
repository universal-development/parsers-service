package com.unidev.parsers.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ParserNotFoundException extends RuntimeException {

    public ParserNotFoundException() {
    }

    public ParserNotFoundException(String message) {
        super(message);
    }

    public ParserNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParserNotFoundException(Throwable cause) {
        super(cause);
    }
}
