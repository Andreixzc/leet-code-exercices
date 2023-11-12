package ArraysHash;

public class Sudoku {
    public static void main(String[] args) {
        char[][] sudoku = {
                { '5', '3', '0', '0', '7', '0', '0', '0', '0' },
                { '6', '0', '0', '1', '9', '5', '0', '0', '0' },
                { '0', '9', '8', '0', '0', '0', '0', '6', '0' },
                { '8', '0', '0', '0', '6', '0', '0', '0', '3' },
                { '4', '0', '0', '8', '0', '3', '0', '0', '1' },
                { '7', '0', '0', '0', '2', '0', '0', '0', '6' },
                { '0', '6', '0', '0', '0', '0', '2', '8', '0' },
                { '0', '0', '0', '4', '1', '9', '0', '0', '5' },
                { '0', '0', '0', '0', '8', '0', '0', '7', '9' }
        };
        verifyQuadrant(sudoku, 0);
    }

    // public static boolean isValidSudoku(char[][] board) {
    // for (int i = 0; i < board.length; i++) {
    // for (int j = 0; j < board[0].length; j++) {
    // System.out.print(board[i][j] + " ");
    // }
    // System.out.println();
    // }
    // return false;
    // }

    public static void verifyQuadrant(char[][] board, int quadrantNumber) {
        // 0 - 3
        // 3 - 6
        // 6 - 9
        for (int i = 3; i < 6; i++) {
            for (int j = 3; j < 6; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
