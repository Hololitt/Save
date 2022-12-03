package Training;

import java.io.IOException;
import java.util.*;

public class Test6 {

    public static void main(String[] args) throws InterruptedException {
        Factorials factorials = new Factorials();
        Thread thread = new Thread(factorials::start);

        thread.start();
        thread.join();
}}
class Factorials{
    Set<Integer> numberOfFactorials = new HashSet<>();
    Scanner scanner = new Scanner(System.in);
    private int functionOfFactorial(int f){
        int result = 1;
        for(int i = 1; i <= f; i++){
            result = result * i;
        }
        return result;
    }
    private int functionOfPrimorial(int f){
        int result = 1;
        for(int i = 1; i < f; i++){
            if(f % 2 != 0){
                result = result * i;
            }
        }
        return result;
    }
    private void getValueOfFactorial(){
        while(true){
            int f = scanner.nextInt();
            if(f == 4132) {
                System.out.println("You exit from program");
                break;
            }
            if(f > 16){
                try{
                    throw new IOException();
                }catch(IOException e){
                    System.out.println("Too big number");
                    break;
                }
            }
            numberOfFactorials.add(functionOfFactorial(f));
            System.out.println(functionOfFactorial(f));
        }
    }
    private void ReadTheArrayOfFactorials(String categoryOfRead){
        switch (categoryOfRead) {
            case "read all" -> {
                for (int count : numberOfFactorials) {
                    try{
                        Thread.sleep(400);
                    }catch (InterruptedException e){
               e.printStackTrace();
                    }
                    System.out.println(count);
                }
            }
            case "read one number" -> {
                int numberOfValue = scanner.nextInt();
                if(!numberOfFactorials.contains(numberOfValue)){
                    try{
                        Thread.sleep(400);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println("false");
                }else{
                    try{
                        Thread.sleep(400);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println(numberOfFactorials.contains(numberOfValue));
                }
            }
            default -> System.out.println("Program not found your argument");
        }
        }
      private void getValueOfPrimorial(){
        while(true){
            int valueOfPrimorial = scanner.nextInt();
            if(valueOfPrimorial == 4132){
                System.out.println("You exit from program");
                break;
            }
            if(valueOfPrimorial > 21){
                try{
                    throw new IOException();
                }catch(IOException e){
                    System.out.println("Too big number");
                }
           }
            System.out.println(functionOfPrimorial(valueOfPrimorial));
        }
}
public void start(){
        while(true){
            String WhatToDo = scanner.nextLine();
            if(Objects.equals(WhatToDo, "stop")){
                System.out.println("program is over...");
                break;
            }
            switch(WhatToDo){
                case "choose kind of factorial":
                    String Factorial = scanner.nextLine();
                    switch (Factorial) {
                        case "factorial" -> getValueOfFactorial();
                        case "primorial" -> getValueOfPrimorial();
                    }
                case "read":
                    String categoryOfReading = scanner.nextLine();
                    ReadTheArrayOfFactorials(categoryOfReading);
            }
        }
        }
}