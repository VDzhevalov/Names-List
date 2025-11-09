package app.utils;

import app.exception.InputException;

import java.util.List;

public class InputValidator {

    public static int validateIndex(String index, List<?> data) throws InputException {
        try {
            return Integer.parseInt(index);
        } catch (NumberFormatException | IndexOutOfBoundsException ex) {
            throw new InputException("Index must be a valid number from 0 to " + data.size());
        }
    }
}
