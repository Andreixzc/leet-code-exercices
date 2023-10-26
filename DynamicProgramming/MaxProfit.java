package DynamicPrograming;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] buy = new int[n];
        int[] sell = new int[n];

        buy[0] = -prices[0];
        sell[0] = 0;

        for (int i = 1; i < n; i++) {
            buy[i] = Math.max(buy[i - 1], -prices[i]);
            sell[i] = Math.max(sell[i - 1], buy[i - 1] + prices[i]);
        }

        return sell[n - 1];
    }

    public static void main(String[] args) {
        MaxProfit solution = new MaxProfit();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int profit = solution.maxProfit(prices);
        System.out.println(profit); // Saída: 5 (comprar no dia 2 a um preço de 1 e vender no dia 5 a um preço de 6)
    }
}
