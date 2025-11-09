package app.utils;

import app.controller.DataController;
import app.dao.DataRepository;
import app.view.UIOperator;

public class AppStarter {
    private static final DataRepository repository = new DataRepository();
    private static final DataController handler = new DataController();
    private static final UIOperator uiOperator = new UIOperator();

    private AppStarter() {}

    public static void start() {
        uiOperator.getOutput(handler.formListOutput(repository.getData()));
        uiOperator.getOutput(handler.formOutput(repository.getData()));
    }
}
