package AdvancedJava.Multithreading;

public class MyVolatile {
    public static void main(String[] args) {
Enter enter = new Enter();
enter.start();

enter.shutdown();
    }
}
class Enter extends Thread{
    private volatile boolean running = true;
    public void run(){
        while(running){
            System.out.println("Fucking slaves");
            try{
                Enter.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }

    }
    public void shutdown(){
        this.running = false;
    }
}