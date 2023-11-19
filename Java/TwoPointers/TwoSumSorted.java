package TwoPointers;

import java.util.Arrays;

public class TwoSumSorted {
    public static void main(String[] args) {
        int[] numbers = { 2, 3, 4 };
        int target = 6;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int i = 0;
        int j = numbers.length - 1;
    
        for (; i < j;) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                ans[0] = i + 1;  
                ans[1] = j + 1;
                return ans;
            } else if (sum > target) {
                j--;
            } else if (sum < target) {
                i++;
            }
        }
    
        return ans;
    }
    
    
}
