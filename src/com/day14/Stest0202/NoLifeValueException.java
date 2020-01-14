package com.day14.Stest0202;

public class NoLifeValueException extends RuntimeException{
//    private static final long serialVersionUID = 1L;
    private String message;

    public NoLifeValueException(String message) {
        super(message);
        this.message = message;
    }
    public NoLifeValueException() {
        super();
    }
}

