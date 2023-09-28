package Random;
//terminar
public class MatrizSearch {
    public static void main(String[] args) {
        // int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // System.out.println(searchMatrix(matriz, 9));
        int[][] matriz = new int[3][3];
        fill(matriz);
        // searchMatrix(matriz, 2);
        int totalIndexes = matriz.length * matriz.length;
        System.out.println(matriz[totalIndexes/2][totalIndexes/2]);
    }


    public static void fill(int[][] matriz) {
        int c = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = c++;
            }
        }
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
        } else if (target < matrix[mid][mid]) {
            dir = mid;
            mid = (esq + dir) / 2;//mid ta pegando valor 1
            System.out.println(esq);
            System.out.println(dir);
            System.out.println(mid);
            // return searchMatrix(matrix, target, mid, esq, dir);
        } else {
            esq = mid;
            mid = (esq + dir) / 2;
            // return searchMatrix(matrix, target, mid, esq, dir);
        }
        return false;

    }
}
