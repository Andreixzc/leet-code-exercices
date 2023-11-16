package InterviewQuestions;

public class PaintBucket {
    public static void main(String[] args) {
        char[][] matriz = {
                { '.', '#', '#', '#', '.', '.' },
                { '.', '#', '.', '.', '#', '.' },
                { '.', '#', '#', '#', '.', '.' },
                { '.', '.', '.', '.', '.', '.' }
        };

        printMatriz(matriz);
        paintRecursive(matriz, 0, 0, 'O');
        printMatriz(matriz);

    }

    public static void paintRecursive(char[][] matriz, int row, int col, char color) {
        if (row < 0 || row >= matriz.length || col < 0 || col >= matriz[0].length || matriz[row][col] != '.') {
            return;
        }
        matriz[row][col] = color;
        paintRecursive(matriz, row - 1, col, color);
        paintRecursive(matriz, row + 1, col, color);
        paintRecursive(matriz, row, col - 1, color);
        paintRecursive(matriz, row, col + 1, color);
    }

    public static void printMatriz(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

}
