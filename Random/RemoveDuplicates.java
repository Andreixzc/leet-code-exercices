package Random;

import java.util.HashMap;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] vet = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(vet);

    }
    public static int removeDuplicates(int[] nums) {
        //[0,0,1,1,1,2,2,3,3,4]
        int k = 0;
        for (int i = 0; i < nums.length-1; i++) {
             int j = i+1;
            while (nums[i] == nums[j]) {
                j++;
                k++; // k = indice da ultima repetição do numnero atual anlisado
            }
            System.out.println("Iteracao: " + i + " K = :" + k);
            nums[i+1] = nums[k+1];
        }

        return 0;
    }

}
