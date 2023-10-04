package DynamicPrograming;

import java.util.Arrays;

public class Stairs {
    public static void main(String[] args) {
        int[] memo = new int[200000];
        Arrays.fill(memo, -1);
        System.out.println(fib(4000, memo));
    }


    public static int fib(int n, int[] memo) {
        if (n <= 2) {
            return 1;
        } else {
            if (memo[n] != -1) {
                return memo[n];
            } else {
                int result = fib(n - 1, memo) + fib(n - 2, memo);
                memo[n] = result;
                return result;
            }
        }
    }
    



}
