package DynamicPrograming;

import java.util.Arrays;

public class FibDinamic {
    public static void main(String[] args) {
        int[] vet = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(vet));
    }

    public static int fib(int n) {
        return fib(n, new int[n + 1]);
    }

    public static int fib(int n, int[] vet) {
        if (n == 0) {
            return vet[n] = 0;
        }
        if (n == 1) {
            return vet[n] = 1;
        }
        if (vet[n] != 0) {
            return vet[n];
        } else {
            return vet[n] = fib(n - 1, vet) + fib(n - 2, vet);
        }


    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int mini = prices[0];

        for (int i = 1; i < prices.length; i++) {
            System.out.println("Subtraindo " + prices[i] + " - " + mini);
            int curProfit = prices[i] - mini;
            System.out.println("Lucro atual: " + curProfit);
            System.out.println("Pegando maior valor entre: " + maxProfit + curProfit);
            maxProfit = Math.max(maxProfit, curProfit);
            mini = Math.min(mini, prices[i]);
        }
        return maxProfit;
    }
}
