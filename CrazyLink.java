
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
public class CrazyLink {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList();
        System.out.println("Wie viel wollen Sie worts aufschreiben?");
        try {
            int scan = scanner.nextInt();
            if (scan <= 10) {
                if (scan % 2 == 0) {
                    for (int i = 0; i < scan; i++) {
                        String w = scanner.nextLine();
                        String w2 = scanner.nextLine();
                        words.add(w + " ---- " + w2);
                    }
                } else {
                    System.out.println("Aufschreiben Sie ganze Zahle");
                }
            } else {
                System.out.println("Sie schrieben zu viel Nummer");

            }
        }catch(InputMismatchException e){
            System.out.println("Sie mussen aufschreiben Nummer");
        }
            for (String string : words) {
                System.out.println(string);
            }




    }

}