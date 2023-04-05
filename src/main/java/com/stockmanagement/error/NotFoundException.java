package com.stockmanagement.error;

public class NotFoundException extends ApiBaseException {
    public NotFoundException(String message) {
        super(message);
    }
}
