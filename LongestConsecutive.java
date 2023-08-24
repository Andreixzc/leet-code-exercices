import java.util.PriorityQueue;

public class LongestConsecutive {
    public static void main(String[] args) {
        
    }
     public static int longestConsecutive(int[] nums) {
        int len = 0;
        if (nums.length == 1) {
            return 1;
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            heap.add(nums[i]);
        }
        Integer current = heap.poll();
        int currentLen = 1;

        while (!heap.isEmpty()) {
            Integer currentNext = heap.poll();
            if (currentNext - 1 == current) {
                currentLen++;
            } else if (currentNext != current) {
                currentLen = 1;
            }
            current = currentNext;
            len = Math.max(len, currentLen);
        }

        return len;
    }
}
