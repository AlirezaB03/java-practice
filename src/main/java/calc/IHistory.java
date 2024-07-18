package calc;

import java.util.List;

public interface IHistory {
    void add (String str);

    List<String> getAll();
}
