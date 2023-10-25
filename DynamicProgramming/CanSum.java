package DynamicProgramming;

import java.util.Arrays;
import java.util.HashMap;

public class CanSum {
    public static void main(String[] args) {
        int[] arr1 = {7, 14};
        int target1 = 300;
        System.out.println(canSumDp(arr1, target1));
    }

    public static boolean canSumDp(int[] vet, int target) {
        HashMap<Integer, Boolean> hash = new HashMap<>();
        return canSumDp(vet, target, hash);
    }

    public static boolean canSumDp(int[] vet, int target, HashMap<Integer, Boolean> hash) {
        if (hash.containsKey(target)) {
            return hash.get(target);
        }
        if (target == 0) {
            return true;
        }
        if (target < 0) {
            return false;
        }
        for (int i = 0; i < vet.length; i++) {
            int resto = target - vet[i];
            if (canSumDp(vet, resto, hash)) {
                return true;
            }
        }
        hash.put(target, false);
        return false;
    }

}
