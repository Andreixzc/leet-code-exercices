package Greedy;

import java.util.Arrays;

public class Skyline {
    public static void main(String[] args) {
        int[][] matrizQuadrada = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        maxIncreaseKeepingSkyline(matrizQuadrada);
        // [0,1][1,1][2,1]
        // // Encontrar o maior valor de cada coluna, e o maior de cada linha.
        // Se o numero da celula atual for == o maior, ignore, se não atribua o menor
        // valor dentre
        // os dois - 1.

    }

    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int numRows = grid.length;
        int numCols = grid[0].length;
        int[] maxRow = new int[numRows];
        int[] maxCol = new int[numCols];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                maxRow[i] = Math.max(maxRow[i], grid[i][j]);
                maxCol[j] = Math.max(maxCol[j], grid[i][j]);
            }
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] == maxCol[i] || grid[i][j] == maxRow[i]) {
                    continue;
                } else {
                    grid[i][j] = Math.min(maxCol[i], maxRow[i])-1;
                }
            }
        }
        for (int i = 0; i < maxCol.length; i++) {
            for (int j = 0; j < maxCol.length; j++) {
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
        return 0;
    }

}
