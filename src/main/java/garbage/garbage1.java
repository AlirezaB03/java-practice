package garbage;

import lern.file.FileRead.FileRead;

import java.io.IOException;

public class garbage1 {

    public static void main(String[] args) throws IOException {
        FileRead file = new FileRead();
        file.makeFile();
        file.readFile();
        file.readFile1();
        file.readFile2();

    }
}



