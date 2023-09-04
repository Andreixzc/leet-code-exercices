package Random;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.text.html.HTMLDocument.Iterator;

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
