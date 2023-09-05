package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] numeros = { 1, 2, 3, 4, 5 };
        threeSum(numeros);

    }
    public static int binarySearch(int[] vet, int left, int right, int target, int flag) {
        if (left > right) {
            return flag;
        }
        int mid = left + (right - left) / 2;
        if (vet[mid] == target) {
            return mid;
        }

        if (vet[mid] < target) {
            return binarySearch(vet, mid + 1, right, target, flag);
        } else {
            return binarySearch(vet, left, mid - 1, target, flag);
        }

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        HashSet<Integer[]> hash = new HashSet<>();
        Arrays.sort(nums);
        int flag = nums[0] - 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] != nums[j]) {
                    int complemento = (nums[i] + nums[j]) * -1;
                    int found = binarySearch(nums, 0, nums.length - 1, complemento, flag);
                    if (found != flag) {
                        Integer[] insert = new Integer[3];
                        insert[0] = nums[i];
                        insert[1] = nums[j];
                        insert[2] = found;
                        if (!hash.contains(insert)) {
                            hash.add(insert);
                        }

                    }

                }
            }
        }
        System.out.println(hash.toString());
        return output;

    }
}
