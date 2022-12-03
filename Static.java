package JC;
import java.util.Scanner;
public class Static {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name :");
        String scan = scanner.nextLine();

        System.out.println("Enter age :");
        int scan2 = scanner.nextInt();
        Human human = new Human(scan,scan2);

    }
}
class Human{

    Scanner scanner = new Scanner(System.in);
    Human(String name, int age){
        this.age = age;
        this.name = name;
    }
    static String name;
    int age;

     void Enter(){           // Scanner cannot be used in static things like void
        String scan = scanner.nextLine();
    }
}