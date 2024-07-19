package file;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
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

        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(textfile.length());
        FileOutputStream fileOutputStream = new FileOutputStream(textfile);
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
        dataOutputStream.writeInt(154);
        dataOutputStream.writeChar('r');
        fileOutputStream.close();
    }


}
