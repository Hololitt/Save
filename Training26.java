package Training;

import java.util.Arrays;

public class Training26 {

    public static void main(String[] args) {
        int[][] arr = new int[5][8];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[1].length; j++) {
                arr[i][j] = j + 1;
            }
        }
        for (int[] anArr : arr) {
            for (int anAnArr : anArr) {
                System.out.print(anAnArr + " ");
            }
            System.out.println();
        }
    }
}