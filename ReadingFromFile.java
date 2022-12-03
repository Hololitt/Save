package JC;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException{
        String separator = File.separator;
String path = ("C:"+ separator+ "Users"+ separator+ "holol"+separator+ "Documents"+ separator+ "Folder"+ separator+ "File100");
File file = new File(path);
Scanner scanner = new Scanner(file);
String line = scanner.nextLine();
String[] words = line.split("");
        System.out.println(Arrays.toString(words));
scanner.close();
    }
}
