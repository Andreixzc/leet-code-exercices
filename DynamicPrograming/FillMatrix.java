package DynamicPrograming;

import java.util.Arrays;

public class FillMatrix {
    public static void main(String[] args) {
        System.out.println(fillMatriz(4));
    }

    public static int fillMatriz(int n){
        int[] arr = new int[n+1];
        arr[0] = 1;
        arr[1] = 0;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = 2 * arr[i-2];
        }
        System.out.println(Arrays.toString(arr));
        return arr[arr.length-1];
    }
}
