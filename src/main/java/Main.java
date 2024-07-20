import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        if (!Files.exists(Path.of("history.txt"))) {
            Files.createFile(Path.of("history.txt"));
        } else {
            System.out.println("File is exists");
        }
    }

}


