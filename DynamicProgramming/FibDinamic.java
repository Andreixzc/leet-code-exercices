package DynamicProgramming;

import java.util.Arrays;

public class FibDinamic {
    public static void main(String[] args) {
        System.out.println(fib(50, new int[50]));
    }

    // public static int fib(int n) {
    // if (n <= 2) {
    // return 1;
    // }
    // if (n == 0) {
    // return 0;
    // }
    // return fib(n - 1) + fib(n - 2);

    // }
    public static int fib(int n, int[] arr) {
        if (n <= 2) {
            return arr[n] = 1;
        }
        if (arr[n] != 0) {
            return arr[n];
        }
        return  arr[n] = fib(n - 1, arr) + fib(n - 2, arr);
    }

}
