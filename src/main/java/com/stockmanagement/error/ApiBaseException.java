package com.stockmanagement.error;

public abstract class ApiBaseException extends RuntimeException{

    public ApiBaseException(String message){
        super(message);
    }
}
