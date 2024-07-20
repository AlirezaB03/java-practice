package lern.file.FileRead;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class FileRead {

    private final String fileNamepath = "/home/amir/Documents/alireza/1/young/history.txt";
    private final String fileName = fileName();

    public String fileName() {
        String fileName;
        String[] split = fileNamepath.split("/");
        fileName = split[split.length - 1];
        System.out.println(fileName);
        return fileName;
    }


    public void makeFile() throws IOException {
        if (!Files.exists(Path.of(fileNamepath))) {
            Files.createFile(Path.of(fileNamepath));
        } else {
            System.out.println("File is exists");
        }
    }

    public void writeFile() throws IOException {
        // default UTF_8
        String s = Files.readString(Paths.get(fileNamepath));
        //or
        // String s = Files.readString(Paths.get(fileName), StandardCharsets.UTF_8);

        System.out.println("_____________________________");
        System.out.printf("Text file in %s:\n %s\n", fileName, s);
        System.out.println("_____________________________");


    }
    public void writeFile1() throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get(fileNamepath));
        String content = new String(bytes, StandardCharsets.UTF_8);
        System.out.println("_____________________________");
        System.out.printf("Text file in %s:\n %s\n", fileName,content);
        System.out.println("_____________________________");
    }

    public void writeFile2() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(fileNamepath),StandardCharsets.UTF_8);
        lines.forEach(System.out::println);
    }

}



