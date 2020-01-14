package com.day14.STest0201;

public class ToothPainExcetion extends Exception {

    public ToothPainExcetion() {
    }

    public ToothPainExcetion(String message) {
        super(message);
    }

    public ToothPainExcetion(String message, Throwable cause) {
        super(message, cause);
    }

    public ToothPainExcetion(Throwable cause) {
        super(cause);
    }

    public ToothPainExcetion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
