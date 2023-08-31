package ArraysAndHashing;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TopKFrequent {
    public static void main(String[] args) {
        
    }
     public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        int[] retorno = new int[k];
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.get(nums[i]) == null) {
                hashMap.put(nums[i], 1);
            } else {
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
            }
        }
        Map.Entry<Integer, Integer>[] entryArray = new Map.Entry[hashMap.size()];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            entryArray[index++] = entry;
        }
        Arrays.sort(entryArray, (entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        for (int i = 0; i < k; i++) {
            retorno[i] = entryArray[i].getKey();
        }
        return retorno;

    }

}
