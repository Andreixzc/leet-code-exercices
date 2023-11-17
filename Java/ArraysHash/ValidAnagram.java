package ArraysHash;
import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "a";
        String t = "ab";
        System.out.println(isAnagramArray(s, t));
        // isAnagramHash(s, t);
    }

    public static boolean isAnagramHash(String s, String t) {
        HashMap<Character, Integer> sFreq = new HashMap<>();
        HashMap<Character, Integer> tFreq = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {

            sFreq.put(s.charAt(i), sFreq.getOrDefault(s.charAt(i), 1) + 1);
            tFreq.put(t.charAt(i), tFreq.getOrDefault(t.charAt(i), 1) + 1);
        }
        return sFreq.equals(tFreq);

    }

    public static boolean isAnagramArray(String s, String t) {
        int[] freqVet = new int[26];
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            freqVet[s.charAt(i) - 'a']++;
            freqVet[t.charAt(i) - 'a']--;

        }
        for (int i = 0; i < freqVet.length; i++) {
            if (freqVet[i] != 0) {
                return false;
            }

        }
        return true;
    }
}
