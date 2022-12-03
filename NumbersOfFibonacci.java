package JC;

public class NumbersOfFibonacci {
    public static void main(String[] args) {
        System.out.println(fibe(100));
    }

    private static long fibe(int n) {
        long[] arr = new long[n + 1];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++)
            arr[1] = arr[i - 1] + arr[i - 2];
            return arr[n];


    }
}