package garbage;

import lern.file.FileRead.File;

import java.io.IOException;

public class garbage1 {

    public static void main(String[] args) throws IOException {
        File file = new File();
        file.makeFile();
        file.writeFile();
        file.writeFile1();
        file.writeFile2();

    }
}



