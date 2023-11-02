package DynamicProgramming;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class KnapsackRecursivo {
    static int knapsackRecursivo(int capacidade, int n) {
        System.out.println(stackCount++);
        if (n == 0 || capacidade == 0) {
            return 0;
        }

        if (weights[n - 1] > capacidade) {
            return knapsackRecursivo(capacidade, n - 1);
        } else {
            return Math.max(values[n - 1] + knapsackRecursivo(capacidade - weights[n - 1], n - 1),
                    knapsackRecursivo(capacidade, n - 1));
        }
    }

    static int knapsackMemoization(int capacidade, int n, int[][] memo) {
        System.out.println(stackCount++);

        if (n == 0 || capacidade == 0) {
            return 0;
        }

        if (memo[n][capacidade] != -1) {
            return memo[n][capacidade];
        }

        if (weights[n - 1] > capacidade) {
            memo[n][capacidade] = knapsackMemoization(capacidade, n - 1, memo);
        } else {
            memo[n][capacidade] = Math.max(
                    values[n - 1] + knapsackMemoization(capacidade - weights[n - 1], n - 1, memo),
                    knapsackMemoization(capacidade, n - 1, memo));
        }

        return memo[n][capacidade];
    }

    static int stackCount = 0;
    static int[] weights = new int[20];
    static int[] values = new int[20];

    public static void main(String[] args) {

        int capacidade = 10000;
        readFromFile();

        System.out.println(Arrays.toString(weights));
        int n = values.length;
        // int resultado = knapsackRecursivo(capacidade, n);
        // System.out.println("O valor máximo que pode ser obtido é: " + resultado);
        int[][] memo = new int[n + 1][capacidade + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= capacidade; j++) {
                memo[i][j] = -1;
            }
        }

        int resultado2 = knapsackMemoization(capacidade, n, memo);
        System.out.println("res: " + resultado2);
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
