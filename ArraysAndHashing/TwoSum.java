package ArraysAndHashing;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] res = new int[2];
        int complemento = 0;
        for (int i = 0; i < nums.length; i++) {
            complemento = target - nums[i];
            if (hashMap.containsKey(complemento)) {
                res[0] = i;
                res[1] = hashMap.get(complemento);

            }
            hashMap.put(nums[i], i);
        }
        return res;
    }

}
