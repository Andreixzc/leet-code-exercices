package ArraysAndHashing;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        //https://leetcode.com/problems/group-anagrams/
    }
    
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            int vet[] = new int[26];// vetor de ocorrencias
            for (int j = 0; j < strs[i].length(); j++) {
                vet[strs[i].charAt(j) - 'a']++; // acha a possivel do char, e incrementa
            }
            StringBuilder currentKey = new StringBuilder();
            for (int j = 0; j < vet.length; j++) {
                currentKey.append(vet[j]);
                currentKey.append('#');// Adicionar # para o caso do corner case de haver mais de 10
                                       // repeticoes
            }
            if (hashMap.containsKey(currentKey.toString())) {
                hashMap.get(currentKey.toString()).add(strs[i]);
            } else {
                List<String> anagramList = new ArrayList<>();
                anagramList.add(strs[i]);
                hashMap.put(currentKey.toString(), anagramList);
            }

        }
        return new ArrayList<>(hashMap.values());

    }

}
