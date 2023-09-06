package Random;

import java.util.HashMap;

public class RepeatedSubstring {
    public static void main(String[] args) {
        String str = "ababba";
        System.out.println(repeatedSubstringPattern(str));
    }
            public static boolean repeatedSubstringPattern(String s) {
                HashMap<Character,Integer> hashMap = new HashMap<>();
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                int index = 0;
                //pegar maior sufixo que não repete e montar a string.
                for (int i = 0; i < s.length(); i++) {
                    if (hashMap.get(s.charAt(i)) == null) {
                        hashMap.put(s.charAt(i), 1);
                        sb.append(s.charAt(i));
                        index++;
                    }
                }
                for (int i = index; i < s.length(); i++) {
                    sb2.append(s.charAt(i));
                }
                return sb2.toString().contains(sb.toString());
            }
}
