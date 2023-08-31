import java.util.Arrays;

public class ProductExcpetSelf {
    public static void main(String[] args) {
        int[] vet = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(productExceptSelf(vet)));

    }

    public static int[] productExceptSelf(int[] nums) {
        int[] preFix = new int[nums.length];
        int[] posFix = new int[nums.length];
        int[] output = new int[nums.length];
        preFix[0] = 1;
        posFix[nums.length - 1] = 1;
        for (int i = 1; i < preFix.length; i++) {
            preFix[i] = nums[i - 1] * preFix[i - 1];
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            posFix[i] = nums[i + 1] * posFix[i + 1];
        }
        for (int i = 0; i < nums.length; i++) {
            output[i] = preFix[i] * posFix[i];
        }
        return output;
    }

}
