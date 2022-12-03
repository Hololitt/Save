package JC;
interface Work{
    public void make1();
}
public class AnonimsClasses  {
    public static void main(String[] args) {
Work work = new Work(){
    public void make1(){

    }
};
work.make1();
    }
}
