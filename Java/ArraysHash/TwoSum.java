package ArraysHash;

import java.util.HashMap;


public class TwoSum {
    public static void main(String[] args) {
        int[] vet = { 3, 2, 4 };
        System.out.println(twoSum(vet, 2));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap1 = new HashMap<>();
        HashMap<Integer, Integer> hashMap2 = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap1.put(nums[i], i);
            hashMap2.put(i, target - nums[i]);
        }

        int[] ans = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (hashMap1.containsKey(hashMap2.get(i)) && i != hashMap1.get(hashMap2.get(i))) {
                ans[0] = i;
                ans[1] = hashMap1.get(hashMap2.get(i));
                break;
            }
        }

        return ans;
    }


}
