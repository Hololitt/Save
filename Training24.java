import javax.swing.*;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Training24 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();
        Gdown gdown = new Gdown();
        System.out.println("Enter dsc");
gdown.scans(scan);

        Thread thread = new Thread(gdown::work);
        Thread thread2 = new Thread(gdown::enterAll);
        try{
            thread.start();
        }catch(InputMismatchException e){
            System.out.println("error");
        }
try{
    thread2.start();
}catch(InputMismatchException e){
    System.out.println("error");
}

thread.join();
thread2.join();

    }
}
class Gdown{
    String[] names = new String[10];
    int[] numbers = new int[10];
    private int number;
    private String name;

public String scans(String word){
        Scanner scanner = new Scanner(System.in);
    switch (word) {
        case "word" -> name = scanner.nextLine();
        case "number" -> number = scanner.nextInt();
        default -> System.out.println("Unknown shit, try again");
    }
    return word;
}
    public void work(){
        Arrays.fill(names, name);
Arrays.fill(numbers, number);
    }
public void enterAll(){
    System.out.println(Arrays.toString(names));
    System.out.println(Arrays.toString(numbers));
    }

}
