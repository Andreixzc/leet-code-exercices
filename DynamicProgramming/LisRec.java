package DynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class LisRec {
    public static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        Map<String, Integer> memo = new HashMap<>();
        return lengthOfLISRecursive(nums, n, -1, memo);
    }

    public static int lengthOfLISRecursive(int[] nums, int currentPos, int prevPos, Map<String, Integer> memo) {
        if (currentPos == 0) {
            return 0;
        }

        String key = currentPos + "_" + prevPos;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int takeCurrent = 0;
        if (prevPos == -1 || nums[currentPos - 1] < nums[prevPos]) {
            takeCurrent = 1 + lengthOfLISRecursive(nums, currentPos - 1, currentPos - 1, memo);
        }

        int skipCurrent = lengthOfLISRecursive(nums, currentPos - 1, prevPos, memo);

        int result = Math.max(takeCurrent, skipCurrent);
        memo.put(key, result);

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {10, 22, 9, 33, 21, 50, 41, 60, 80};
        int length = lengthOfLIS(nums);
        System.out.println("Comprimento da maior subsequência crescente: " + length);
    }
}

