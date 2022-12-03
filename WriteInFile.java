package JC;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteInFile {
    public static void main(String[] args) {
File file = new File("flm");
try {
    PrintWriter pw = new PrintWriter(file);
    pw.println("jhfWJFJHwjfhÖJSFHÖwe");
}catch(FileNotFoundException e){

}

    }
}
