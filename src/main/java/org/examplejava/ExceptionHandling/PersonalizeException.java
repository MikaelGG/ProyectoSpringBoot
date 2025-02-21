package org.examplejava.ExceptionHandling;

public class PersonalizeException extends Exception{

    public PersonalizeException(String message, Throwable cause) {
        super(message, cause);
    }

    public PersonalizeException(String message) {
        super(message);
    }
}
