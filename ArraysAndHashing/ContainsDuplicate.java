package ArraysAndHashing;
import java.util.HashMap;

public class ContainsDuplicate {
    public static void main(String[] args) {
        //https://leetcode.com/problems/contains-duplicate/
    }
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
            if (hashMap.get(nums[i]) > 1) {
                return true;
            }
        }
        return false;
    }
}
