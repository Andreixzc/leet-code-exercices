package Random;

import java.util.Arrays;

public class DuplicateLetter {
    public static void main(String[] args) {
        System.out.println(removeDuplicateLetters("abbcbabsb"));
    }

    public static String removeDuplicateLetters(String s) {
        int[] letters = new int[26];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (letters[s.charAt(i) - 97] == 0) {
                letters[s.charAt(i) - 97] = 1;

            }
        }
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] != 0) {
                int numero = i + 97;
                char caractere = (char) numero;
                sb.append(caractere);
            }
        }
        return sb.toString();
    }
}
