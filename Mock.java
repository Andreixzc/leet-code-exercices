import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mock {
    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> anagramGroups = groupAnagrams(words);
        System.out.println('z' - 'a');
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String s = strs[i];
            int[] count = new int[26];

            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                count[c - 'a']++;
            }

            StringBuilder keyBuilder = new StringBuilder();
            for (int j = 0; j < count.length; j++) {
                keyBuilder.append(count[j]).append("#");
            }
            System.out.println(keyBuilder.toString());
            String key = keyBuilder.toString();

            if (!anagramGroups.containsKey(key)) {
                anagramGroups.put(key, new ArrayList<>());
            }

            anagramGroups.get(key).add(s);
        }
        return new ArrayList<>(anagramGroups.values());
    }

}
