package ArraysHash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> result = groupAnagrams(strs);
        System.out.println(result);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<Map<Character, Integer>, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            Map<Character, Integer> freqMap = createFreqMap(strs[i]);//retorna tabela de frequencia da string[i]
            if (map.containsKey(freqMap)) {
                //Se o hashmap recém criado já estiver no mapa 'pai' significa que temos uma correspondencia no anagrama
                //Puxamos a lista do mapa filho passano o hashmap de frequencia
                List<String> list = map.get(freqMap);
                //Adicionamos ela na lista que vai ser o retorno
                list.add(strs[i]);
            } else {
                List<String> list = new ArrayList<>(); 
                //se ela não armazenada no map, instanciamos uma lista com a string que acabou de ser analisada.
                list.add(strs[i]);
                //colocamos ela no mapa, passando o hashmap de frequencia como chave, e a lista recém criada como valor.
                map.put(freqMap, list);
            }
        }
        return new ArrayList<>(map.values());
    }

    public static Map<Character, Integer> createFreqMap(String str) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        return freqMap;
    }
}
