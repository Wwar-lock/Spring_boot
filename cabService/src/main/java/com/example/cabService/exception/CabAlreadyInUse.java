package com.example.cabService.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Cab already in use!!")
public class CabAlreadyInUse extends Exception {
    public CabAlreadyInUse(String message) {
        super(message);
    }
}
