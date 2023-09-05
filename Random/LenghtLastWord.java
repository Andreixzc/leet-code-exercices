package Random;

public class LenghtLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("andrei xdds  "));
    }

    public static int lengthOfLastWord(String s) {
        int ptr = s.length() - 1;
        int count = 0;
    
        while (ptr >= 0 && s.charAt(ptr) == ' ') {
            ptr--;
        }
        while (ptr >= 0 && s.charAt(ptr) != ' ') {
            count++;
            ptr--;
        }
    
        return count;
    }
    
}
