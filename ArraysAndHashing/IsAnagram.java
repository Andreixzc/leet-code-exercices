import java.util.HashMap;

public class IsAnagram {
    public static void main(String[] args) {
        //https://leetcode.com/problems/valid-anagram/
    }
     public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;

        } else {
            HashMap<Character, Integer> hashMap1 = new HashMap<>();
            HashMap<Character, Integer> hashMap2 = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                hashMap1.put(s.charAt(i), hashMap1.getOrDefault(s.charAt(i), 0) + 1);
                hashMap2.put(t.charAt(i), hashMap2.getOrDefault(t.charAt(i), 0) + 1);
            }
            return hashMap1.equals(hashMap2);

        }
    }
}
