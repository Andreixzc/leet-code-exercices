import java.util.HashMap;

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] sudokuBoard = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        isValidSudoku(sudokuBoard);
    }

    public static boolean isValidSudoku(char[][] board) {
        boolean isValid = true;

        isValid &= analyzeQuadrant(board, 0, 0); // Primeiro quadrante
        isValid &= analyzeQuadrant(board, 0, 3); // Segundo quadrante
        isValid &= analyzeQuadrant(board, 0, 6); // Terceiro quadrante
        isValid &= analyzeQuadrant(board, 3, 0); // Quarto quadrante
        isValid &= analyzeQuadrant(board, 3, 3); // Quinto quadrante
        isValid &= analyzeQuadrant(board, 3, 6); // Sexto quadrante
        isValid &= analyzeQuadrant(board, 6, 0); // Sétimo quadrante
        isValid &= analyzeQuadrant(board, 6, 3); // Oitavo quadrante
        isValid &= analyzeQuadrant(board, 6, 6); // Nono quadrante

        return isValid;
    }



    public static boolean analyzeQuadrant(char[][] board, int startRow, int startCol) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] != '.') {
                    if (hashMap.containsKey(board[i][j])) {
                        return false; // Found a duplicate
                    }
                    Integer count = hashMap.get(board[i][j]);
                    if (count == null) {
                        hashMap.put(board[i][j], 1);
                    } else {
                        hashMap.put(board[i][j], count + 1);
                    }
                }
            }
        }
        return true; // Quadrant is valid
    }



}
