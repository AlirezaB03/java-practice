package calc;

import java.util.List;

public interface HistoryHandler {
    void add (String str);

    List<String> getAll();
}
