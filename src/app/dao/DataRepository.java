package app.dao;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {
    public List<String> getData() {
        return new ArrayList<>(List.of("Alice", "Bob", "Lucy", "Denis", "Tom"));
    }
}