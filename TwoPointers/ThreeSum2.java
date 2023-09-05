package TwoPointers;

import java.lang.annotation.Retention;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum2 {
    public static int binarySearch(int[] nums, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Element not found
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(nums);
        int right = nums.length-1;
        
        for (int i = 0; i < nums.length; i++) {
            for (int left = i+1; left < nums.length; left++) {
                if (nums[i] == nums[left]) {
                    
                }
            }
        }

        return output;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum(nums);
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}

