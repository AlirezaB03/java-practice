package calc;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FileHistoryHandler implements HistoryHandler {
    private final String filePath = "/home/amir/Documents/alireza/1/young/historyWrite.txt";
    List<String> history = new ArrayList<>();

    FileHistoryHandler() throws IOException {
        if (!Files.exists(Path.of(filePath))) {
            Files.createFile(Path.of(filePath));
        } else {
            System.out.println("File already exists");
        }
    }

    @Override
    public void add(String result) throws IOException {

        history.add(result);
    }


    @Override
    public List<String> getAll() throws IOException {
        List<String> form = new ArrayList<>();
        form.add("<<History>>");
        form.add(" ");
        for (int i = 0; i < history.size(); i++) {
            form.add((i + 1) + ") " + history.get(i));
        }
        List<String> content = Arrays.asList(form.toArray(new String[form.size()]));
        Files.write(Path.of(filePath), content, StandardCharsets.UTF_8);
        System.out.println();
      /*  List<String> content =  Arrays.asList(String.valueOf(history));
        for  (int i = 0; i < content.size(); i++) {
            Files.write(Path.of(filePath), content.get(i).getBytes(StandardCharsets.UTF_8));
        }
        Files.write(Path.of(filePath), content , StandardCharsets.UTF_8);*/
        return history;
    }

}
