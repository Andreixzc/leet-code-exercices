package Random;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {

        int[] vet = { 9,9 };
        System.out.println(Arrays.toString(plusOne(vet)));
    }

    public static int[] plusOne(int[] digits) {
        int i = 0;
        for (i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] += 1;
                break;
            } else {
                digits[i] = 0;
            }

        }
        if (i < 0) {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            for (int j = 1; j < res.length; j++) {
                res[j] = digits[j - 1];
            }
            return res;
        }
        return digits;
    }
}
