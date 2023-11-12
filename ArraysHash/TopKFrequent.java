package ArraysHash;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.SortedMap;
import java.util.TreeMap;

public class TopKFrequent {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 2, 3 };
        System.out.println(Arrays.toString(topKFrequent(arr, 2)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        int idx = 0;

        SortedMap<Integer, Integer> sortedMap = new TreeMap<>(Collections.reverseOrder());

        for (int i = 0; i < nums.length; i++) {
            sortedMap.put(nums[i], sortedMap.getOrDefault(nums[i], 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
                Comparator.comparingInt(Map.Entry::getValue));

        for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
            minHeap.offer(entry);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        while (!minHeap.isEmpty()) {
            ans[idx++] = minHeap.poll().getKey();
        }

        return ans;
    }
}
