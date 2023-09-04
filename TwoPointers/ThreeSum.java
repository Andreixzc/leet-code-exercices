package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println(binarySearch(numeros, 0, numeros.length - 1, 1));

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        HashSet<Integer[]> set = new HashSet<>();
        Arrays.sort(nums);
        int sum = 0;
        int discardIndex = nums[0] - 1;
        int complemento;
        int j = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            sum = nums[i] + nums[j];
            if (sum == 0) {
                complemento = 0;
            } else if (sum > 0) {
                complemento = sum * -1;
            } else {
                complemento = sum * -1;
            }
            // fazer busca binaria?
            // adicionar um valor a pos do vetor para ignorar na busca?
            // i = 0, j = i + 1? Calcular complemento e jogar na busca binaria. Se retornar um
            // indice valido, adiciono
            // vet[i], vet[j] vet[binary] ao set. Se a busca binaria nao encontrar eu incremento o j
        }

        return output;
    }

    public static int binarySearch(int[] vet, int left, int right, int target) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        if (vet[mid] == target) {
            return mid;
        }

        if (vet[mid] < target) {
            return binarySearch(vet, mid + 1, right, target);
        } else {
            return binarySearch(vet, left, mid - 1, target);
        }


    }

}
