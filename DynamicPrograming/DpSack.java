package DynamicPrograming;

public class DpSack {

    public static void main(String[] args) {
        int[] valores = {2, 2, 4, 5, 3}; // Valores dos itens
        int[] pesos = {3, 1, 3, 4, 2}; // Pesos dos itens
        int capacidade = 8; // Capacidade da mochila
        int n = valores.length;

        int resultado = mochila01(capacidade, pesos, valores, n);
        System.out.println("O valor máximo da mochila é: " + resultado);
    }

    public static int mochila01(int capacidade, int pesos[], int valores[], int n) {
        int[][] dp = new int[n + 1][capacidade + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= capacidade; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (pesos[i - 1] <= j) {
                    dp[i][j] = Math.max(valores[i - 1] + dp[i - 1][j - pesos[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][capacidade];
    }
}

