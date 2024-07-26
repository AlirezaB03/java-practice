package lern.file.FileRead;

import java.io.IOException;

public class TestRead {
    public static void main(String[] args) throws IOException {
        FileRead file = new FileRead();
        file.makeFile();
        file.readFile();
        file.readFile1();
        file.readFile2();

    }
}
