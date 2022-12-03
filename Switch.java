package JC;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the random number");
        int scan = scanner.nextInt();

        switch(scan){
            case 1:
                System.out.println("something");
                break;
            case 2:
                System.out.println("SDLIFHSDHSD");
                break;
            default:
                scan= scan+4;
                System.out.println(scan);
                break;
        }
    }
}
