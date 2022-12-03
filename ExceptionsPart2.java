package JC.Exceptions4part;
import java.io.IOException;
import java.util.Scanner;
public class ExceptionsPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
while(true){
    int x = Integer.parseInt( scanner.nextLine());
    if(x != 10){
        try{
            throw new IOException();
        }catch(IOException e){
            System.out.println("sdfjhsdf");
        }
    }else{
        System.out.println("You enter the 10");

    scanner.close();
    }
}
    }
}
