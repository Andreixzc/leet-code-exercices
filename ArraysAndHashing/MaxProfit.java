package ArraysAndHashing;
public class MaxProfit {
    public static void main(String[] args) {
        int vet[] = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(vet));
    }

    public static int maxProfit(int[] prices) {
        int currentProfit = 0;
        int j = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[j] < prices[i]) {
                int potentialProfit = prices[i] - prices[j];
                if (potentialProfit > currentProfit) {
                    currentProfit = potentialProfit;
                }
            } else {
                j = i;
            }
        }

        return currentProfit;
    }
}
