package lern.file.FileWrite;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;


public class FileWrite {

    private final String filePath = "/home/amir/Documents/alireza/1/young/historyWrite.txt";
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
        Files.writeString(Path.of(filePath), content);
    }

    public void writeFile1() throws IOException {
        List<String> content = Arrays.asList("534","awetrw");
        Files.write(Path.of(filePath), content);
    }

    public void writeFile22(Path path, String content) throws IOException {
        Files.write(path, content.getBytes(StandardCharsets.UTF_8));
        /* or
        * Files.writeString(path,content);
        */


    }

    public void writeFile2() throws IOException {
        final String newLine = System.lineSeparator();
        writeFile22(Path.of(filePath), "hello" + newLine);
    }
    public void writeFile3() throws IOException {

        try (FileWriter fw = new FileWriter(filePath,true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("what!");
            bw.newLine();
        }
    }
}



