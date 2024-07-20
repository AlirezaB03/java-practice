package garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class garbage1 {

    public static void main(String[] args) throws IOException {
        if (!Files.exists(Path.of("/home/amir/Documents/alireza/1/young/history.txt"))) {
            Files.createFile(Path.of("/home/amir/Documents/alireza/1/young/history.txt"));
        } else {
            System.out.println("File is exists");
        }
    }

    String fileName = "/home/amir/Documents/alireza/1/young/history.txt";

    public void readFile() throws IOException {
        // default UTF_8
        String s = Files.readString(Paths.get(fileName));
        System.out.println(s);

        // String s = Files.readString(Paths.get(fileName), StandardCharsets.UTF_8);
    }
}



