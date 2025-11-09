package app.view;

import app.exception.InputException;

import java.util.Scanner;

import static app.utils.InputValidator.validateIndex;
import static app.view.IndexTitle.printTitle;

public class NameIndexView {

    public static int getIndexForData() {
        printTitle();
        String index;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            index = scanner.nextLine().strip();
            try {
                return validateIndex(index);
            } catch (InputException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
