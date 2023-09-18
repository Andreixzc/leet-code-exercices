package Random;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.RowFilter.Entry;

public class EqualFrequency {

    public static void main(String[] args) {
        System.out.println(equalFrequency("bac"));
    }

    public static boolean equalFrequency(String word) {
        int current = 0;
        int prev = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                //nao pode comecar j com i +1 , pq desse jeito ignora-sse os outros chars
                HashMap<Character, Integer> hashMap = new HashMap<>();
                if (!hashMap.containsKey(word.charAt(j))) {
                    hashMap.put(word.charAt(j), 1);
                } else {
                    hashMap.put(word.charAt(i), hashMap.get(word.charAt(i)) + 1);
                }
            }
        }
        return false;
    }



}
