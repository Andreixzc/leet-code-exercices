package DynamicProgramming;

public class SubSec {

    public static void main(String[] args) {
        String s1 = "ezupkr";
        String s2 = "ubmrapg";
        System.out.println(longestCommonSubsequence(s1, s2));

    }

    public static int longestCommonSubsequence(String s1, String s2) {
        return longestCommonSubsequence(s1, s2, s1.length(), s2.length());
    }
    
    public static int longestCommonSubsequence(String s1, String s2, int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
            return 1 + longestCommonSubsequence(s1, s2, m - 1, n - 1);
        }
        return Math.max(longestCommonSubsequence(s1, s2, m - 1, n), longestCommonSubsequence(s1, s2, m, n - 1));
    }
    


}
