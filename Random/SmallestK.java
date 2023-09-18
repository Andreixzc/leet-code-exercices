package Random;

public class SmallestK {
    public static void main(String[] args) {
        int N1 = 10;
        System.out.println(findSmallestK(N1));
        int N2 = 25;
        
    }

    public static int findSmallestK(int N) {
        int[] factorials = new int[N + 1];
        factorials[0] = 1;

        int i = 1;
        while (factorials[i - 1] < N) {
            factorials[i] = factorials[i - 1] * i;
            i++;
        }

        int k = 0;
        int currentSum = 0;
        for (int j = i - 1; j >= 0; j--) {
            while (currentSum + factorials[j] <= N) {
                currentSum += factorials[j];
                k++;
            }
        }

        return k;
    }

}
