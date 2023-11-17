package ArraysHash;
import java.util.PriorityQueue;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] vet = { 100, 4, 200, 1, 3, 2 };
        System.out.println(longestConsecutive(vet));
    }

    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            heap.add(nums[i]);
        }
        int currentElement = heap.poll();
        int currentMax = 1;
        int count = 1;
        while (!heap.isEmpty()) {
            int nextElement = heap.poll();

            if (currentElement == nextElement) {
                continue; 
            }

            if (currentElement + 1 == nextElement) {
                count++;
            } else {
                currentMax = Math.max(currentMax, count);
                count = 1; 
            }

            currentElement = nextElement;
        }
        return Math.max(currentMax, count);
    }
}
