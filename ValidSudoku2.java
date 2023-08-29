import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ValidSudoku2 {
    public static void main(String[] args) {
        char[][] sudokuBoard = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };
        isValidSudoku(sudokuBoard);
    }

    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            verificaSubMatriz(board, i);
            System.out.println("-----------");
        }
        return true;
    }
    public static boolean verificaSubMatriz(char[][] board, int subMatrizNumber) {
        int subMatrizRow = (subMatrizNumber / 3) * 3;
        int subMatrizCol = (subMatrizNumber % 3) * 3;
    
        for (int i = subMatrizRow; i < subMatrizRow + 3; i++) {
            for (int j = subMatrizCol; j < subMatrizCol + 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    
        return false;
    }
}
