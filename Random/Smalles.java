package Random;

public class Smalles {

    public static void main(String[] args) {
        System.out.println(smallest(10));
    }

    public static int smallest(int n) {
        int[] vet = new int[n + 1];
        int solucao = 0;
        int soma = 0;
        int aux = vet.length - 1;
        vet[0] = 1;
        for (int i = 1; i <= n; i++) {
            vet[i] = vet[i - 1] * i;
        }

        while (soma < n) {
            while (aux > 0 && soma + vet[aux] > n) {
                aux--;
            }
            if (aux == 0) {
                return -1;

            }
            soma += vet[aux];
            solucao++;
        }

        return solucao;
    }
}
