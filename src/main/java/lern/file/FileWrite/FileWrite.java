package lern.file.FileWrite;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWrite {
    public void r() throws IOException {
        String content = "hello world";
        Path path = Paths.get("/home/amir/Documents/alireza/1/young/history.txt");
        Files.write(path, content.getBytes(StandardCharsets.UTF_8));
    }
}
