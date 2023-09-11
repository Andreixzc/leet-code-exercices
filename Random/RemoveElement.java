package Random;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int vet[] = { 0, 1, 2, 2, 3, 0, 4 };
        System.out.println(removeElement(vet, 2));
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;
      
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                k++;
                nums[i] = nums[k];
            }
            
        }
        return k;
    }
}
