package Random;

public class LenghtLastWord {
    public static void main(String[] args) {

    }

    public static int lengthOfLastWord(String s) {
        int len = s.length() - 1;
        int lastWordEnd = len;
        char charSpace = ' ';
        while (len >= 0 && s.charAt(len) == charSpace) {
            len--;
        }
        
        while (lastWordEnd >= 0 && s.charAt(lastWordEnd) != charSpace) {
            lastWordEnd--;
        }
        return len - lastWordEnd;
    }
}
