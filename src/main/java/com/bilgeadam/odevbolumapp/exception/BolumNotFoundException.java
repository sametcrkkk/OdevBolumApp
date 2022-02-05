package com.bilgeadam.odevbolumapp.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class BolumNotFoundException extends RuntimeException{

    public BolumNotFoundException(String message) {
        super(message);
    }
}
