package com.example.cabService.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST,reason = "Already added")
public class DriverAlreadyAdded extends Exception{
    public DriverAlreadyAdded(String message) {
        super(message);
    }
}
