package DynamicPrograming;

public class Mat {
    public static void main(String[] args) {
        // Defina o tamanho da matriz
        int linhas = 3;
        int colunas = 3;

        // Crie uma matriz
        int[][] matriz = new int[linhas][colunas];

        // Preencha a matriz com valores
        int valor = 1;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = valor;
                valor++;
            }
        }

        // Imprima a matriz
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Pule para a próxima linha após cada linha da matriz
        }
        System.out.println(matriz[0][1]);
    }
}
