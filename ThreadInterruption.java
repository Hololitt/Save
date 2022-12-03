package AdvancedJava.Multithreading;

import java.util.Random;
import java.util.Scanner;
public class ThreadInterruption {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                for(int i = 0; i<10000000; i++){
                    try{
                        Thread.sleep(1);
                    }catch(InterruptedException e){
                        System.out.println("Thread was interrupted");
                          break;
                    }
                    Math.sin(random.nextInt());
                }
            }

        });

        System.out.println("Staring Thread");
      thread.start();
thread.interrupt();                                             //Thread throws exceptions when thread was interrupted
      thread.join();
        System.out.println("Thread has finished");
    }
}