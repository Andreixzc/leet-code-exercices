package Random;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] vet = { 0,1,1,1,1,2,2,3,3,4 };
        System.out.println(removeDuplicates(vet));

    }

    public static int removeDuplicates(int[] nums) {
        int k = 1; 
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i]; 
                k++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }

    
    public static int removeDuplicates2(int[] nums) {
        int k = 1;
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            
            while (nums[i] == nums[k-1]) {
                count++;
                k++;
            }
            k = i;
            nums[i+1] = nums[k+1];

        }
        return count;
    }
    

}