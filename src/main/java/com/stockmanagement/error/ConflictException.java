package com.stockmanagement.error;

public class ConflictException extends ApiBaseException{
    public ConflictException(String message) {
        super(message);
    }
}
