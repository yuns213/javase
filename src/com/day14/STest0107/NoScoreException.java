package com.day14.STest0107;

public class NoScoreException extends RuntimeException {

    //  空参构造
    public NoScoreException() {
        super();
    }
    // 有参构造
    public NoScoreException(String message) {
        super(message);
    }
}

