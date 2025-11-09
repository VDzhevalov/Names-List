package app.view;

import app.exception.InputException;

import java.util.List;
import java.util.Scanner;

import static app.utils.InputValidator.validateIndex;
import static app.view.IndexTitle.printTitle;

public class NameIndexView {

    public static int getIndexForData(List<?> data) {
        printTitle();
        String index;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            index = scanner.nextLine().strip();
            try {
                return validateIndex(index,  data);
            } catch (InputException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
