package Training;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("EinWohner");
        double scan = scanner.nextDouble();
        System.out.println("Wachstum");
        double scan2 = scanner.nextDouble();

        for(int i = 0; i < 9; i++){

            switch (i) {
                case 1 -> System.out.println( scan * scan2);
                case 2 -> System.out.println(scan * scan2 * scan2);
                case 3 -> System.out.println(scan * scan2 * scan2 * scan2);
                case 4 -> System.out.println(scan * scan2 * scan2 * scan2 * scan2);
                case 5 -> System.out.println(scan * scan2 * scan2 * scan2 * scan2 * scan2);
                case 6 -> System.out.println(scan * scan2 * scan2 * scan2 * scan2 * scan2 * scan2);
                case 7 -> System.out.println(scan * scan2 * scan2 * scan2 * scan2 * scan2 * scan2 * scan2);
                case 8 -> System.out.println(scan * scan2 * scan2 * scan2 * scan2 * scan2 * scan2 * scan2 * scan2);
            }
        }
    }
}
