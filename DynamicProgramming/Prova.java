package DynamicProgramming;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Prova {
    static int stackCount = 0;
    static int[] weights = new int[20];
    static int[] values = new int[20];

    public static void main(String[] args) {
        int capacidade = 10000;
        int[][] memo = new int[values.length + 1][capacidade + 1];
        fillDp(memo);
        readFromFile();
        System.out.println(Arrays.toString(weights));
        System.out.println("RESULTADO FINAL: " + knapSackMemo(capacidade, values.length, memo));
    }

    public static void fillDp(int[][] dp) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
    }

    public static int knapSackMemo(int capacidade, int n, int[][] memo) {
        System.out.println(stackCount++);
        if (capacidade == 0 || n == 0) {
            return memo[n][capacidade] = 0;
        }
        if (memo[n][capacidade] != -1) {
            return memo[n][capacidade];
        }

        

        if (weights[n - 1] > capacidade) {
            return memo[n][capacidade] = knapSackMemo(capacidade, n - 1, memo);
        } else {
            int pegar = memo[n][capacidade] = values[n - 1] + knapSackMemo(capacidade - weights[n - 1], n - 1, memo);
            int passar = memo[n][capacidade] = knapSackMemo(capacidade, n - 1, memo);
            return Math.max(pegar, passar);
        }
    }

    public static void readFromFile() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("valores.txt"));

            String line;
            int i = 0;

            while ((line = reader.readLine()) != null && i < 20) {
                String[] parts = line.split(" ");
                weights[i] = Integer.parseInt(parts[0]);
                values[i] = Integer.parseInt(parts[1]);
                i++;
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
