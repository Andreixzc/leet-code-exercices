package DynamicProgramming;
import java.util.HashMap;

public class Knapsack {
    public static void main(String[] args) {
        int[] values = {6, 10, 12};
        int[] weights = {1, 2, 3};
        int knapsackCapacity = 5;
        HashMap<String, Integer> memo = new HashMap<>();
        int result = maxValueInKnapsack(values, weights, knapsackCapacity, 0, memo);
        System.out.println(result); // O resultado é o valor máximo na mochila
    }

    public static int maxValueInKnapsack(int[] values, int[] weights, int remainingCapacity, int itemIndex, HashMap<String, Integer> memo) {
        // Verifica se o resultado já foi calculado e armazenado
        String key = itemIndex + "-" + remainingCapacity;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        if (remainingCapacity < 0 || itemIndex >= values.length) {
            return 0;
        }

        // Opção 1: Não incluir o item atual
        int maxValueWithoutItem = maxValueInKnapsack(values, weights, remainingCapacity, itemIndex + 1, memo);

        // Opção 2: Incluir o item atual
        int itemValue = values[itemIndex];
        int itemWeight = weights[itemIndex];
        int maxValueWithItem = itemValue + maxValueInKnapsack(values, weights, remainingCapacity - itemWeight, itemIndex + 1, memo);

        // Calcula o valor máximo entre as duas opções
        int maxValue = Math.max(maxValueWithoutItem, maxValueWithItem);

        // Armazena o resultado no dicionário de memoização
        memo.put(key, maxValue);

        return maxValue;
    }
}
