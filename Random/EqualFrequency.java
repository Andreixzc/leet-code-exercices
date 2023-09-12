package Random;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.RowFilter.Entry;

public class EqualFrequency {

    public static void main(String[] args) {
        equalFrequency("bac");
        //criar mapa de frequencia
        //contar quantos valores diferentes
        //Se existir mais de um valor diferente, retorne falso
        //Se apenas existir um valor diferente, verificar se a frequencia dele é apenas 1 unidade maior do que seus diferentes.
        //se sim, retornar true caso não retornar falso.
    }

    public static boolean equalFrequency(String word) {
        HashMap<Character, Integer> hash = new HashMap<>();
        int difCount = 0;
        char difKey = '\0'; // Inicialize com um valor nulo
        int prev = 0;

        for (int i = 0; i < word.length(); i++) {
            if (!hash.containsKey(word.charAt(i))) {
                hash.put(word.charAt(i), 1);
            } else {
                hash.put(word.charAt(i), hash.get(word.charAt(i)) + 1);
            }
        }

        prev = hash.get(word.charAt(0));

        for (Map.Entry<Character, Integer> set : hash.entrySet()) {
            if (set.getValue() != prev) {
                if (Math.abs(set.getValue() - prev) != 1) {
                    return false;
                }
                difKey = set.getKey();
                difCount++;
            }
            if (difCount > 1) {
                return false;
            }
            prev = set.getValue();
        }
        if (difCount == 0) {
            return false;
            
        }
        return true;
    }
}
