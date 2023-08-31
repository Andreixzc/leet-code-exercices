package TwoPointers;

import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int[] vet = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(vet, 9)));;

    }

    public static int[] twoSum(int[] numbers, int target) {
       int i = 0;
       int j = numbers.length-1;
       int[] output = new int[2];
       while (i<j) {
            if (numbers[i] + numbers[j] == target) {
                output[0] = i+1;
                output[1] = j+1;
                return output;
            } else if (numbers[i] + numbers[j] > target) {
                j--;
            } else {
                i++;
            }
       }
       return output;
    }
}
