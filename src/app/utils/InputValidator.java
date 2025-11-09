package app.utils;

import app.exception.InputException;

public class InputValidator {

    public static int validateIndex(String index) throws InputException {
        try {
            return Integer.parseInt(index);
        } catch (NumberFormatException e) {
            throw new InputException("Index must be a valid number");
        }
    }
}
