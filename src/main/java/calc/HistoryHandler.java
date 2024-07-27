package calc;

import java.io.IOException;
import java.util.List;

public interface HistoryHandler {
    void add (String str) throws IOException;

    List<String> getAll()throws IOException;
}
