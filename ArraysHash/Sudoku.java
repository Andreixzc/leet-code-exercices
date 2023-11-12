package ArraysHash;

import java.util.HashSet;

public class Sudoku {
    public static void main(String[] args) {
        char[][] board = {
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
        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (!verificaLinha(board, i) || !verificaColuna(board, i) || !verificaSubMatriz(board, i)) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean verificaLinha(char[][] board, int row) {
        HashSet<Character> set = new HashSet<>();
        for (int j = 0; j < 9; j++) {
            if (board[row][j] != '.') {
                if (set.contains(board[row][j])) {
                    return false;
                } else {
                    set.add(board[row][j]);
                }
            }
        }
        return true;
    }
    
    public static boolean verificaColuna(char[][] board, int col) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            if (board[i][col] != '.') {
                if (set.contains(board[i][col])) {
                    return false;
                } else {
                    set.add(board[i][col]);
                }
            }
        }
        return true;
    }
    
    public static boolean verificaSubMatriz(char[][] board, int subMatrizNumber) {
        int subMatrizRow = (subMatrizNumber / 3) * 3;
        int subMatrizCol = (subMatrizNumber % 3) * 3;
        HashSet<Character> set = new HashSet<>();
        for (int i = subMatrizRow; i < subMatrizRow + 3; i++) {
            for (int j = subMatrizCol; j < subMatrizCol + 3; j++) {
                if (board[i][j] != '.') {
                    if (set.contains(board[i][j])) {
                        return false;
                    } else {
                        set.add(board[i][j]);
                    }
                }
            }
        }
        return true;
    }
}
