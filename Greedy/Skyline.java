package Greedy;

public class Skyline {
    public static void main(String[] args) {
        int[][] matrizQuadrada = {
                { 2, 5, 1 },
                { 0, 3, 9 },
                { 8, 5, 2 }
        };
        System.out.println(maxIncreaseKeepingSkyline(matrizQuadrada));

    }

    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int numRows = grid.length;
        int numCols = grid[0].length;
        int[] maxRow = new int[numRows];
        int[] maxCol = new int[numCols];
        int sum = 0;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                maxRow[i] = Math.max(maxRow[i], grid[i][j]);
                maxCol[j] = Math.max(maxCol[j], grid[i][j]);
            }
        }
        for (int i = 0; i < maxCol.length; i++) {
            for (int j = 0; j < maxCol.length; j++) {
                int newHeight = Math.min(maxCol[j], maxRow[i]);
                sum += newHeight - grid[i][j];

            }
        }
        return sum;

    }

}
