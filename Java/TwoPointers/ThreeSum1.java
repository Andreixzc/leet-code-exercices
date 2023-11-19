package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ThreeSum1 {
    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        System.out.println(nums[nums.length-1]);
        threeSum(nums);
        
    }

    public static List<List<Integer>> threeSumBruteForce(int[] nums) {
        // brute force approach, without sorting the array.
        List<List<Integer>> ans = new LinkedList<>();
        Set<List<Integer>> resultSet = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int possiblySum = nums[i] + nums[j] + nums[k];
                    if (possiblySum == 0) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        triplet.sort(null);
                        resultSet.add(triplet);
                    }
                }
            }
        }
        ans.addAll(resultSet);
        return ans;
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int i = 0;
        int j = nums.length - 2;
        int current = nums.length-1;

        return ans;
    }
}
