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
            Map<Character, Integer> freqMap = createFreqMap(strs[i]);
            if (map.containsKey(freqMap)) {
                List<String> list = map.get(freqMap);
                list.add(strs[i]);
            } else {
                List<String> list = new ArrayList<>(); 
                list.add(strs[i]);
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
