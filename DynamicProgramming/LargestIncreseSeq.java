package DynamicProgramming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class LargestIncreseSeq {
    public static void main(String[] args) {
           int[] largeArray = generateLargeArray(1000, 1, 1000);
        System.out.println(lengthOfLIS(largeArray));
        System.out.println(Arrays.toString(largeArray));
    }

    public static int[] generateLargeArray(int size, int minValue, int maxValue) {
        int[] array = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(maxValue - minValue + 1) + minValue;
        }
        return array;
    }
    

    public static int lengthOfLIS(int[] lis) {
        HashMap<Integer, Integer> memo = new HashMap<>();
        int max = 0;
        for (int i = 0; i < lis.length; i++) {
            max = Math.max(max, lengthOfLIS(lis, i, memo));
        }
        return max;
    }

    public static int lengthOfLIS(int[] lis, int idx, HashMap<Integer, Integer> memo) {
        if (idx >= lis.length) {
            return 1;
        }
        if (memo.containsKey(idx)) {
            return memo.get(idx);
        }
        int maxLen = 1;
        for (int i = idx + 1; i < lis.length; i++) {
            if (lis[i] > lis[idx]) {
                maxLen = Math.max(maxLen, 1 + lengthOfLIS(lis, i, memo));
            }
        }
        memo.put(idx, maxLen);
        return maxLen;
    }
}
