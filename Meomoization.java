package JC;
import java.util.Arrays;
public class Meomoization {
    public static void main(String[] args) {
        int n = 100;
        long[] mem = new long[n + 1];
        Arrays.fill(mem, - 1);
        System.out.println(fibnaive(n, mem));

    }
    private static long fibnaive(int n, long[] mem){
if(mem[n] != -1)
    return n;
if(mem[n] >= 1)
    return n;

      var result = fibnaive(n - 1, mem) + fibnaive(n - 2, mem);
mem[n] = result;
return result;
    }
}
