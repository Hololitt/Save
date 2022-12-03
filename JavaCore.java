import java.util.Scanner;
public class JavaCore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          Slave slave = new Slave();

        System.out.println("Enter the age");

        int scan = scanner.nextInt();
if(scan<13){
    System.out.println("Your slave must be older than "+scan);

}
if(scan>60){
    System.out.println("Slave´s older 70 is slow and not effective");
}


}
    }

class Slave{
    private int age;
    private String name;

    public void setage(int age){
        System.out.println(age);
        this.age =age;
    }
}