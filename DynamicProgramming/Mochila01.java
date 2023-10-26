package DynamicProgramming;
public class Mochila01 {

    
    public static int mochila01(int capacidade, int pesos[], int valores[], int n) {
        int[][] dp = new int[n + 1][capacidade + 1];

        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= capacidade; w++) {
                if (i == 0 || w == 0) {
                    dp[i][w] = 0;
                } else if (pesos[i - 1] <= w) {
                    dp[i][w] = Math.max(valores[i - 1] + dp[i - 1][w - pesos[i - 1]], dp[i - 1][w]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        return dp[n][capacidade];
    }

    public static void main(String[] args) {
        // int capacidade = 10;
        // int valores[] = {60, 100, 120};
        // int pesos[] = {10, 20, 30};
        // int n = valores.length;

        // int resultado = mochila01(capacidade, pesos, valores, n);
        // System.out.println("O valor máximo da mochila é: " + resultado);
        System.out.println(Math.max(5, 5));
    }
}

