package garbage;

import lern.file.FileRead.FileRead;

import java.io.IOException;

public class garbage1 {

    public static void main(String[] args) throws IOException {
        FileRead file = new FileRead();
        file.makeFile();
        file.writeFile();
        file.writeFile1();
        file.writeFile2();
        System.out.println("");

        
    }
}



