package AdvancedJava.Multithreading;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Consumer2 {
    public static void main(String[] args) throws InterruptedException {
ProducerConsumer pc = new ProducerConsumer();
Thread thread1 = new Thread(new Runnable() {
    @Override
    public void run() {
        try {
            pc.produce();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
});
Thread thread2 = new Thread(new Runnable() {
    @Override
    public void run() {
        try {
            pc.consume();
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

class ProducerConsumer{
Queue<Integer> queue = new ArrayBlockingQueue<>(10);
private final Object o = new Object();

    public void produce() throws InterruptedException {
    int value = 0;
    while(true){
synchronized (o){
    int limit = 10;
    while(queue.size()== limit){
        o.wait();
    }
    queue.offer(value++);
    o.notify();
}
    }
}
public void consume() throws InterruptedException {
while(true){
    synchronized (o){
        while(queue.size()==0){
            o.wait();
        }
        int value = queue.poll();
        System.out.println(value);
        System.out.println("Queue size is "+ queue.size());
        o.notify();
    }
    Thread.sleep(1000);
}
}

        }