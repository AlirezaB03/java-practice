package lern.file.FileWrite;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;


public class FileWrite {

    private final String filePath = "/home/amir/Documents/alireza/project/java-practice/java-practice/historyWrite.txt";
    private final String fileName = fileName();

     FileWrite() throws IOException {
        Path path = Paths.get(filePath);
        if (!Files.exists(path)) {
            Files.createFile(path);
        } else {
            System.out.println("File already exists");
            System.out.println("-----------------------------");
        }
    }

    public String fileName() {
        String fileName;
        String[] split = filePath.split("/");
        fileName = split[split.length - 1];
        return fileName;
    }

    public void writeFile() throws IOException {
        String content = "git ring";
        Files.write(Path.of(filePath), content.getBytes(StandardCharsets.UTF_8));
    }
    public void writeFile1() throws IOException {
         List<String> content = Arrays.asList("git ringg");
         Files.write(Path.of(filePath),content);
    }
}



