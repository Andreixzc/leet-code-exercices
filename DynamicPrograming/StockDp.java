package DynamicPrograming;

import java.util.Arrays;

public class StockDp {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int ans = maxProfit(prices);
        System.out.println("Lucro máximo: " + ans);
    }

    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n][2];

        int buy = 0;  // Índice da coluna que representa a opção de comprar
        int sell = 1; // Índice da coluna que representa a opção de vender

        dp[0][buy] = -prices[0];
        dp[0][sell] = 0;

        for (int i = 1; i < n; i++) {
            dp[i][buy] = Math.max(dp[i - 1][buy], -prices[i]);
            dp[i][sell] = Math.max(dp[i - 1][sell], dp[i - 1][buy] + prices[i]);
        }

        return Math.max(dp[n - 1][buy], dp[n - 1][sell]);
    }
}

