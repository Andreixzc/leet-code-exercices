package InterviewQuestions;

public class GridTraveler {

    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 7));
    }

    public static int uniquePaths(int m, int n) {
        int[][] memo = new int[m + 1][n + 1];
        return uniquePaths(m, n, memo);
    }

    public static int uniquePaths(int m, int n, int[][] memo) {
        if (memo[m][n] != 0) {
            return memo[m][n];
        }
        if (m == 1 || n == 1) {
            return memo[m][n] = 1;
        }
        memo[m][n] = uniquePaths(m - 1, n, memo) + uniquePaths(m, n - 1, memo);
        return memo[m][n];
    }

}
