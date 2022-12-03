package AdvancedJava.Multithreading;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.CountDownLatch;

public class JavaCountDownLatch {
    public static void main(String[] args) throws InterruptedException {

        CountDownLatch countDownLatch = new CountDownLatch(3);
ExecutorService excecutorService = Executors.newFixedThreadPool(3);
for(int num = 0; num<3; num++)
excecutorService.submit(new Processor(countDownLatch));
excecutorService.shutdown();
countDownLatch.await();
        System.out.println("sjdkflasjfladf");
    }
}
class Processor implements Runnable{
private final CountDownLatch countDownLatch;
public Processor(CountDownLatch countDownLatch){
    this.countDownLatch = countDownLatch;
}
    @Override
    public void run() {
try{
    Thread.sleep(3000);
}catch(InterruptedException e){
    e.printStackTrace();
}
countDownLatch.countDown();
    }
}