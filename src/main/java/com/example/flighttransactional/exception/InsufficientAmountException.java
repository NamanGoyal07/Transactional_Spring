package com.example.flighttransactional.exception;

public class InsufficientAmountException extends RuntimeException {
    public InsufficientAmountException(String message){
        super(message);
    }
}
