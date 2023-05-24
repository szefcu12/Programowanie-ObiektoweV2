package net.kkopec.exceptions;


public class ArgumentListTooShortException extends Exception {
    public ArgumentListTooShortException(int expected_length, int given_length) {
        super("Lista argumentów jest za krótka. Spodziewane: " + expected_length + ", Otrzymane: " + given_length);
    }
}
