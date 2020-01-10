package edu.city.exception;

/**
 * Created by ВАСЯ on 09.01.2020.
 */
//обработка исключений
public class PersonCheckException extends Exception {
    public PersonCheckException() {
    }

    public PersonCheckException(String message) {
        super(message);
    }

    public PersonCheckException(String message, Throwable cause) {
        super(message, cause);
    }

    public PersonCheckException(Throwable cause) {
        super(cause);
    }

    public PersonCheckException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}