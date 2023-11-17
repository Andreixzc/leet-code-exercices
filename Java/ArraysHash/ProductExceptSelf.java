package ArraysHash;
public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        productExceptSelf(arr);
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] preFix = new int[nums.length];
        int[] posFix = new int[nums.length];
        int[] output = new int[nums.length];
        posFix[nums.length - 1] = 1;
        preFix[0] = 1;
        int j = nums.length - 2;
        for (int i = 1; i < preFix.length; i++) {
            preFix[i] = nums[i - 1] * preFix[i - 1];
            posFix[j] = nums[j + 1] * posFix[j + 1];
            j--;

        }
        for (int i = 0; i < output.length; i++) {
            output[i] = preFix[i] * posFix[i];
        }
        return output;
    }

}
