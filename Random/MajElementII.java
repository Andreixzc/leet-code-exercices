package Random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MajElementII {
    public static void main(String[] args) {
        int[] vet = { 3,2,3 };
        System.out.println(vet.length);
        System.out.println(majorityElement(vet));
    }

    public static List<Integer> majorityElement(int[] nums) {
        int freq = (int) Math.ceil((double) nums.length / 3);
        System.out.println(freq);
        ArrayList<Integer> output = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], 1);
            } else {
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
            }
        }
        for (Integer key : hashMap.keySet()) {
            if (hashMap.get(key) >= freq) {
                output.add(key);
            }
        }

        return output;
    }
}
