package DynamicPrograming;

public class DpNewSack {
    public static void main(String[] args) {
        int[] valores = {2, 2, 4, 5, 3}; // Valores dos itens
        int[] pesos = {3, 1, 3, 4, 2}; // Pesos dos itens
        int capacidade = 8; // Capacidade da mochila

        int resultado = maxValue(capacidade, pesos, valores, valores.length);
        System.out.println("O valor máximo na mochila é: " + resultado);
    }

    public static int maxValue(int capacidade, int pesos[], int valores[], int itens) {
        int[][] dpMat = new int[itens + 1][capacidade + 1];

        for (int i = 0; i <= itens; i++) {
            for (int j = 0; j <= capacidade; j++) {
                if (i == 0 || j == 0) {
                    dpMat[i][j] = 0; // Se a capacidade atual ou o item atual valer 0, não se pode
                                     // adicionar nenhum item.
                } else if (pesos[i-1] <= j) { // se o item atual 'couber' na mochila:
                    int Naoincluir = dpMat[i - 1][j];
                    // Ultimo melhor valor para a capacidade atual, se consideramos a não inclusão
                    // do item atual, que é uma celula acima da atual.


                    int incluir = valores[i-1] + dpMat[(i - 1)][j - pesos[i - 1]];

                     /*inha int incluir = valores[i-1] + dpMat[(i - 1)][j - pesos[i - 1]]; significa qual seria o meu valor final, 
                     ao incluir o item atual juntamente com o ultimo valor encontrado em que esse meu valor atual respeita a capacidade */   
                    
                    
                     // Considerar a inclusao do item atual, que seria o valor do item atual + o
                    // ultimo melhor valor que ainda se é possivel adiciona-lo respeitando a
                    // capacidade
                    dpMat[i][j] = Math.max(Naoincluir, incluir);
                }
            }
        }
        return dpMat[itens][capacidade];
    }
}
