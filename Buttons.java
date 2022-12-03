package Training;
import java.util.Scanner;
import java.util.Random;
public class Buttons {
    public static void main(String[] args) {
        for(int i =0; i<1; i++){
            System.out.println(Math.floor (Math.random()*10));          //round округляет в большую сторону
                                                                        //floor в меньшую
        }
       Random random = new Random();

        for(int i =0; i<100;i++){
            System.out.println(random.nextInt(11)+2);
            
        }



    }
}
