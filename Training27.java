package Training;
import java.util.*;
import java.util.concurrent.CountDownLatch;

public class Training27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CountDownLatch countDownLatch = new CountDownLatch(5);
        Word1 word1 = new Word1(new CountDownLatch(5));
        Word2 word2 = new Word2(new CountDownLatch(5));

List<String> list = new ArrayList<>();
list.add(String.valueOf(new Word1(countDownLatch)));
       list.add(String.valueOf(new Word2(countDownLatch)));
        int a = (int) (Math.random()*list.size());
String taskForUser = "Übersetzen Wort ";

        switch (a) {
            case 0 -> {
                System.out.println(taskForUser + word1.getWord2());
                word1.check(scanner.nextLine());
            }
            case 1 -> {
                System.out.println(taskForUser + word2.getWord2());
                word2.check(scanner.nextLine());
            }
            default -> System.out.println("number outside the search area");
        }
    }

}
interface Task{
     String toString();
}
class Main{

}
class Word1 extends Main implements Task {
    @Override
    public String toString() {
        return "Word1{" +
                "word1='" + word1 + '\'' +
                ", word2='" + word2 + '\'' +
                '}';
    }
    private final CountDownLatch countDownLatch;
    Word1(CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }
   private String word1 = "Bedürfen";
    private String word2 = "нуждаться";
public void check(String word){
    if(countDownLatch.getCount() == 0){
        System.out.println("finish");
    }
    if(Objects.equals(this.word2, word)){
        countDownLatch.countDown();
        System.out.println("true");
    }else{
        System.out.println("Correct answer is " + getWord1());
    }
}
    public String getWord1() {
        return word1;
    }

    public void setWord1(String word1) {
        this.word1 = word1;
    }

    public String getWord2() {
        return word2;
    }

    public void setWord2(String word2) {
        this.word2 = word2;
    }
}
class Word2 extends Word1 implements Task {
    @Override
    public String toString() {
        return "Word2{" +
                "word1='" + word1 + '\'' +
                ", word2='" + word2 + '\'' +
                '}';
    }
    Word2(CountDownLatch countDownLatch) {
        super(countDownLatch);
    }
   private String word1 = "Betragen";
    private String word2 = "составлять";

    @Override
    public String getWord1() {
        return word1;
    }

    @Override
    public String getWord2() {
        return word2;
    }
}