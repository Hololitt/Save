package JC.Exceptions4part;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class ExceptionsPart1 {
    public static void main(String[] args) {
        File file = new File("awd");
        try {
            Scanner scanner = new Scanner(file);

        } catch (FileNotFoundException e){

        }
    }
}