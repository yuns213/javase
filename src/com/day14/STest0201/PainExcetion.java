package com.day14.STest0201;

public class PainExcetion extends Exception {

    public PainExcetion() {
    }

    public PainExcetion(String message) {
        super(message);
    }

    public PainExcetion(String message, Throwable cause) {
        super(message, cause);
    }

    public PainExcetion(Throwable cause) {
        super(cause);
    }

    public PainExcetion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);


    }
}
