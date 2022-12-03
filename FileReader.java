package Training;

import java.io.FileWriter;

public class FileReader {
    public static void main(String[] args) throws Exception {
        int k1 = 2;
        int k2 = 9;
        newFile( k1, k2);
    }


    public static void newFile(int k1, int k2) throws Exception {
        FileWriter nFile = new FileWriter("suchu");

        for(int i = k1; i <= k2; i++) {

            nFile.write(i);

        }

        nFile.close();
    }
}