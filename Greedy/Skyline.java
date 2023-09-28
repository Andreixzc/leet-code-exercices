package Greedy;

import java.util.Arrays;

public class Skyline {
    public static void main(String[] args) {
        int[][] matrizQuadrada = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        maxIncreaseKeepingSkyline(matrizQuadrada);

    }

    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        // Encontrar o maior valor de cada coluna, e o maior de cada linha.
        // Se o numero da celula atual for == o maior, ignore, se não atribua o menor valor dentre
        // os dois - 1.
        int[] maxRowVector = new int[grid.length];
        int minValue = Integer.MIN_VALUE;
        int[] maxColumnVector = new int[grid.length];
        for (int i = 0; i < maxColumnVector.length; i++) {
            maxRowVector[i] = minValue;
            minValue = Integer.MIN_VALUE;
            for (int j = 0; j < maxColumnVector.length; j++) {
                if (grid[i][j] > minValue) {
                    minValue = grid[i][j];
                }
            } 
        }
        System.out.println(Arrays.toString(maxRowVector));
        return 0;
    }
}
