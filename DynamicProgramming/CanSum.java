package DynamicProgramming;

import java.util.Arrays;

public class CanSum {
    public static void main(String[] args) {
        int[] arr1 = {2, 3};
        int target1 = 7;
        System.out.println(canSum(arr1, target1));
    }

    public static boolean canSum(int[] vet, int target) {
        Boolean[] memo = new Boolean[target + 1];
        Arrays.fill(memo, null);
        return canSum(vet, target, memo);
    }

    public static boolean canSum(int[] vet, int target, Boolean[] memo) {
        if (target < 0) {
            return false;
        }

        if (memo[target] != null) {
            return memo[target];
        }

        if (target == 0) {
            return true;
        }

        for (int i = 0; i < vet.length; i++) {
            int remainder = target - vet[i];
            if (canSum(vet, remainder, memo)) {
                // memo[target] = true;
                return true;
            }
        }

        memo[target] = false;//chegar aqui, significa que iteramos sobre todo o vetor
        return false;
    }
}
