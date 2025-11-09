package app.model;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static app.view.NameIndexView.getIndexForData;
import static java.lang.String.format;

public class DataHandler {

    public String formOutput(List<String> list) {
        int index = getIndexForData();
        try {
            String name = list.get(index);
            return format("Name: %s is in index %d in list", name, index);
        } catch (IndexOutOfBoundsException e) {
            return "Wrong index! Must be between 0 and " + (list.size() - 1);
        }
    }

    public String formListOutput(List<String> list) {
        StringBuilder sb = new StringBuilder();
        AtomicInteger count = new AtomicInteger(1);
        for (String name : list) {
            sb.append(format("%d) %s%n",
                    count.getAndIncrement(), name));
        }
        return "\nNames:\n" + sb;
    }
}
