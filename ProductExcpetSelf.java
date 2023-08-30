import java.util.Arrays;

public class ProductExcpetSelf {
    public static void main(String[] args) {
        int[] vet = {1,2,3,4,5};
        System.out.println(Arrays.toString(vet));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int right = 1, left = 1;
        for (int i = 0; i < nums.length; i++) {
            arr[i] = left;
            left *= nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            arr[i] *= right;
            right *= nums[i];
        }
        return arr;
    }
}
