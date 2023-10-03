package Random;

import java.util.Arrays;

public class GoodPairs {
    public static void main(String[] args) {
        int[] vet = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(vet));
    }

    public static int numIdenticalPairs(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
    
        for (int i = 0; i < nums.length;) {
            int j = i + 1;
            while (j < nums.length && nums[j] == nums[i]) {
                count += j - i;
                j++;
            }
            i = j; 
        }
    
        return count;
    }
}
