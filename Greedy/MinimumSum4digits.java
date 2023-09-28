package Greedy;

import java.util.Arrays;

public class MinimumSum4digits {
    public static void main(String[] args) {
        System.out.println(minimumSum(2932));

    }

    public static int minimumSum(int num) {
        String str = String.valueOf(num);
        String sortedStr = "";
        char[] charArray = str.toCharArray();
        int[] arr = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            arr[i] = Character.getNumericValue(charArray[i]);
        }
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            sortedStr += Integer.toString(arr[i]);
        }
        char[] nArr = sortedStr.toCharArray();
        String concatenacao1 = String.valueOf(nArr[0]) + String.valueOf(nArr[3]);
        String concatenacao2 = String.valueOf(nArr[1]) + String.valueOf(nArr[2]);
        return Integer.valueOf(concatenacao1) + Integer.valueOf(concatenacao2);


    }

    public static void bubbleSort(int[] vet) {

        for (int i = 0; i < vet.length; i++) {
            for (int j = i + 1; j < vet.length; j++) {
                if (vet[i] > vet[j]) {
                    swap(vet, i, j);
                }
            }
        }
    }

    public static void swap(int[] vet, int posHigh, int posLow) {
        int tmp = vet[posHigh];
        vet[posHigh] = vet[posLow];
        vet[posLow] = tmp;


    }
}
