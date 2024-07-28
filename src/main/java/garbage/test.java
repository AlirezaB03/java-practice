package garbage;

import java.io.IOException;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

public class test {
    List<String> history = new ArrayList<>();

    private void add() {
        history.add("add");
        history.add("add1");
        history.add("add2");
        history.add("add3");
    }

    private void content() throws IOException {
        add();
        String t = "";
        for (int i = 0; i < history.size(); i++) {
          t += history.get(i)+"\n";
        }
        System.out.println(t);
    }

    public static void main(String[] args) throws IOException {
        test test = new test();
        test.content();
    }
}

