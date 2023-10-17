package DynamicPrograming;

public class Saco {
    static int[] valores = {6, 10, 12}; // Valores dos objetos
    static int[] pesos = {1, 2, 3}; // Pesos dos objetos
    static int capacidadeMochila = 5;

    public static void main(String[] args) {
        int n = valores.length;
        int valorMaximo = mochila01Recursiva(n, capacidadeMochila);
        System.out.println("Valor máximo na mochila: " + valorMaximo);
    }

    public static int mochila01Recursiva(int n, int capacidade) {
        if (n == 0 || capacidade == 0) {
            return 0;
        } //Se ja tivermos testado todos os itens para a instancia atual, ou se a capacidade tiver sido estourada, retorna-se 0.

        if (pesos[n - 1] > capacidade) {
            return mochila01Recursiva(n - 1, capacidade);
        }//Se o peso do item atual for maior que a capacidade atual, desconsideramos o item e passamos para o item n-1;

        //Incluir vai ser o maior valor possível de todas as combinações do item N á seus antecessores.
        int incluir = valores[n - 1] + mochila01Recursiva(n - 1, capacidade - pesos[n - 1]);
        //calcula o maior valor possivel de nao incluir o item N atual.
        int naoIncluir = mochila01Recursiva(n - 1, capacidade);

        return Math.max(incluir, naoIncluir);
    }

}
