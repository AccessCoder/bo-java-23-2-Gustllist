package de.neuefische;

public class GuestNotFoundException extends Exception {

    public GuestNotFoundException(String message) {
        super(message);
    }

    public GuestNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
