package Random;
import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int vet[] = { 1,1,1,5,1,5,1 };
        removeElement(vet, 5);
        System.out.println(Arrays.toString(vet));
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;

            }
        }
        return k;
    }
}
