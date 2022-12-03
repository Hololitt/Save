package AdvancedJava.Multithreading;

public class WaitNotify {

    public static void main(String[] args) throws InterruptedException{
        Machine m = new Machine();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    m.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    m.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread1.start();
thread2.start();

thread1.join();
thread2.join();
    }
}
class Machine{
   private final Object o = new Object();
    public void produce() throws InterruptedException {
synchronized (o){
    System.out.println("something");
   o.wait();
    Thread.sleep(400);
    System.out.println("Continue");
}
    }
    public void consume() throws InterruptedException{
            System.out.println("cunsume is starting");

            synchronized (o){
            Thread.sleep(400);
              o.notify();
        }
    }
}