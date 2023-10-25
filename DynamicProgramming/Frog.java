package DynamicProgramming;

import java.util.Arrays;

public class Frog {
    public static void main(String[] args) {
        // System.out.println(howManyWaysRec(52));
        System.out.println(howManyWays(52));
    }

    public static int howManyWays(int n) {
        // Create an array to store previously calculated values
        int[] memo = new int[n + 1];
        // Initialize the memoization array
        Arrays.fill(memo, -1);
        return howManyWaysRec(n, memo);
    }

    private static int howManyWaysRec(int n, int[] memo) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (memo[n] != -1) {
            return memo[n];
        }

        memo[n] = howManyWaysRec(n - 1, memo) + howManyWaysRec(n - 2, memo);
        return memo[n];
    }

}
