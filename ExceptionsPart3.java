package JC.Exceptions4part;
import java.util.Scanner;
public class ExceptionsPart3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scan = scanner.nextInt();
        int[] numbers = new int[5];
        System.out.println(numbers[scan]);    //scan can be > int[5]

        //Checked Exceptions - exceptions in during work of program

        ///////////////////////////////////////////////

        int a = 1/0;
        System.out.println(a);

        //Unchecked - errors in program

    }
}
