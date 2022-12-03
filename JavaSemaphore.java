package AdvancedJava.Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class JavaSemaphore {
    public static void main(String[] args) {
     /*   Semaphore semaphore = new Semaphore(5);
        try{
                semaphore.acquire();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        semaphore.release();

        System.out.println(semaphore.availablePermits());

      */
        ExecutorService executorService = Executors.newFixedThreadPool(200);
Connection connection = Connection.getConnection();
        for(int i = 0; i<200; i++){
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        connection.work();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    executorService.shutdown();
                    try {
                        executorService.awaitTermination(60, TimeUnit.SECONDS);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
    }
}
private static class Connection{
    private int ConnectionsCount;
    private static final Connection connection = new Connection();
   private static final Semaphore semaphore = new Semaphore(10);
    public static Connection getConnection(){
return connection;
    }
    public void work() throws InterruptedException{
semaphore.acquire();
try{
    doWork();
} finally{
    semaphore.release();
}
    }
    public void doWork() throws InterruptedException {
synchronized (this){
    ConnectionsCount++;
    System.out.println(ConnectionsCount);
}
        Thread.sleep(5000);

synchronized (this){
    ConnectionsCount--;
}
    }
}}