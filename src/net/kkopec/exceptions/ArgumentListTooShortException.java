package net.kkopec.exceptions;


public class ArgumentListTooShortException extends Exception {
    public ArgumentListTooShortException(int expected_length, int given_length) {
        super("Argument list is too short. Expected: " + expected_length + ", Delivered: " + given_length);
    }
}
