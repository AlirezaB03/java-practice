import calc.IHistory;

import java.util.ArrayList;
import java.util.List;

public class InMemoryHistory implements IHistory {
    @Override
    public void add(String result) {
        List<String> history = new ArrayList<>();
        history.add(result);

    }

    @Override
    public List<String> getAll() {
        return List.of();
    }
}
