package Random;

public class MatrizSearch {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(searchMatrix(matriz, 9));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        return searchMatrix(matrix, target, matrix.length / 2, 0, matrix.length - 1);
    }

    public static boolean searchMatrix(int[][] matrix, int target, int mid, int esq, int dir) {
        if (esq > dir) {
            return false;
        }
        if (matrix[mid][mid] == target) {
            return true;
        } else if (matrix[mid][mid] < target) {
            dir = mid;
            mid = (esq + dir) / 2;
            return searchMatrix(matrix, target, mid, esq, dir);
        } else {
            esq = mid;
            mid = (esq + dir) / 2;
            return searchMatrix(matrix, target, mid, esq, dir);
        }

    }
}
