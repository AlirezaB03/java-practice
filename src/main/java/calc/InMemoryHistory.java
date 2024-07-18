package calc;

import java.util.ArrayList;
import java.util.List;

public class InMemoryHistory implements IHistory {

    List<String> history = new ArrayList<>();

    @Override
    public void add(String result) {
        history.add(result);
    }

    @Override
    public List<String> getAll() {
        return history ;
    }
}
