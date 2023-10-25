package DynamicPrograming;

import java.util.HashMap;

public class Lis {

    public static void main(String[] args) {
        int[] vet = {10, 9, 2, 5, 3, 7, 101, 18};
        int maxLength = lengthOfLIS(vet);
        System.out.println("Comprimento da sequência crescente mais longa: " + maxLength); // Saída:
                                                                                           // 4
    }

    public static int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        HashMap<Integer, Integer> memo = new HashMap<>();
        int max = 1;

        for (int i = 1; i < nums.length; i++) {
            int length = findLength(nums, i, memo);
            max = Math.max(max, length);
        }

        return max;
    }

    public static int findLength(int[] nums, int currentIndex, HashMap<Integer, Integer> memo) {
        if (memo.containsKey(currentIndex)) {
            return memo.get(currentIndex);
        }

        int max = 1;

        for (int i = 0; i < currentIndex; i++) {
            if (nums[currentIndex] > nums[i]) {
                int length = 1 + findLength(nums, i, memo);
                max = Math.max(max, length);
            }
        }

        memo.put(currentIndex, max);
        return max;
    }


}


