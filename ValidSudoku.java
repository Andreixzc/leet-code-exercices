import java.util.HashMap;

public class ValidSudoku {
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
    }

    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (!isValidRow(board, i) || !isValidColumn(board, i)) {
                return false;
            }
        }

        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!isValidQuadrant(board, i, j)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean isValidRow(char[][] board, int row) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int j = 0; j < 9; j++) {
            if (board[row][j] != '.') {
                if (hashMap.containsKey(board[row][j])) {
                    return false;
                }
                hashMap.put(board[row][j], 1);
            }
        }
        return true;
    }

    public static boolean isValidColumn(char[][] board, int col) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            if (board[i][col] != '.') {
                if (hashMap.containsKey(board[i][col])) {
                    return false;
                }
                hashMap.put(board[i][col], 1);
            }
        }
        return true;
    }

    public static boolean isValidQuadrant(char[][] board, int startRow, int startCol) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] != '.') {
                    if (hashMap.containsKey(board[i][j])) {
                        return false;
                    }
                    hashMap.put(board[i][j], 1);
                }
            }
        }
        return true;
    }
}
