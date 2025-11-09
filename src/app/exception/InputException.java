package app.exception;

public class InputException extends RuntimeException {
    public InputException(String message) {
        super("Invalid input: " + message + " Please try again.");
    }
}
