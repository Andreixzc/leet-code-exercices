package ArraysAndHashing;
import java.util.TreeSet;

public class LongestConsecutive {
    public static void main(String[] args) {
        int vet[] = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(vet));
    }

    public static int longestConsecutive(int[] nums) {
        int count = 0;
        int current;
        int highest = 0;
        int prev;
        TreeSet<Integer> set = new TreeSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        prev = set.pollFirst();
        while (!set.isEmpty()) {
            current = set.pollFirst();
            if (current - prev == 1) {
                count++;
                highest = Math.max(highest, count);
            } else {
                count = 0;

            }
            prev = current;

        }
        return highest+1;


    }
}
