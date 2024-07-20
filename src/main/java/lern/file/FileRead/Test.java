package lern.file.FileRead;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        File file = new File();
        file.makeFile();
        file.writeFile();
        file.writeFile1();
        file.writeFile2();

    }
}
