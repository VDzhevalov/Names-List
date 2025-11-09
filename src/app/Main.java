package app;

import app.dao.DataRepository;
import app.controller.DataController;
import app.view.UIOperator;

public class Main {

    public static void main(String[] args) {
        DataRepository repository = new DataRepository();
        DataController handler = new DataController();
        UIOperator uiOperator = new UIOperator();
        uiOperator.getOutput(handler.formListOutput(repository.getData()));
        uiOperator.getOutput(handler.formOutput(repository.getData()));
    }
}
