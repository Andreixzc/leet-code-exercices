package DynamicPrograming;

public class SubSec {

    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
        System.out.println(LcsRecursive(s1, s2));

    }

    public static int LcsRecursive(String s1, String s2) {
        return LcsRecursive(s1, s2, s1.length(), s2.length());
    }

    public static int LcsRecursive(String s1, String s2, int m, int n) {

        if (m == 0 || n == 0) {
            return 0;
        }
        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
            return 1 + Math.max(LcsRecursive(s1, s2, --m, n), LcsRecursive(s1, s2, m, --n));
        }
        return Math.max(LcsRecursive(s1, s2, --m, n), LcsRecursive(s1, s2, m, --n));

    }


}
