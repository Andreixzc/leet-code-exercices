package Greedy;

public class SplitedBalancedString {
    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLRRRLLRLL"));
    }

    public static int balancedStringSplit(String s) {
        int lCount = 0;
        int rCount = 0;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                rCount++;
            } else {
                lCount++;
            }
            if (lCount != 0 && rCount != 0) {
                if (rCount == lCount) {
                    ans++;
                    rCount = 0;
                    lCount = 0;
                }
            }
        }

        return ans;
    }
}
