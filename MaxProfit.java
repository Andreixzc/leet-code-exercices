public class MaxProfit {
    public static void main(String[] args) {
        int vet[] = { 7, 1, 5, 3, 2, 4 };
        maxProfit(vet);
    }
    
    public static int maxProfit(int[] prices) {
        int currentProfit = Integer.MIN_VALUE;
        int j = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[j] < prices[i]) {
                if (prices[i] - prices[j] > currentProfit) {
                    currentProfit = prices[i] - prices[j];
                }
            } else {
                j = i;
            }
        }
        return currentProfit;
    }
}
