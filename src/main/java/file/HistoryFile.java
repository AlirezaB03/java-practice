package file;

import java.io.File;
import java.io.IOException;

public class HistoryFile {
    public static void main(String[] args) throws IOException {
        File file = new File("D://HistoryCalc");
        File textfile = new File(file, "HistoryCalc.txt");
        if (!file.exists()) {
            file.mkdirs();
        }

        if (!textfile.exists()) {
            textfile.createNewFile();
        }
    }
}
