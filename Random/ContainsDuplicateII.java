package Random;
import java.util.HashMap;
public class ContainsDuplicateII {
    public static void main(String[] args) {
        int[] vet = { 1, 2, 3, 1, 2, 3 };
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                if (Math.abs(hashMap.get(nums[i])-i)<= k) {
                    return true;
                }
            }
            hashMap.put(nums[i], i);
        }
        return false;
    
    }
    
}
