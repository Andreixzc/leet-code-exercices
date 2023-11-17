package TwoPointers;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            char leftChar = s.charAt(i);
            char rightChar = s.charAt(j);

            if (!Character.isLetterOrDigit(leftChar)) {
                i++;
            } else if (!Character.isLetterOrDigit(rightChar)) {
                j--;
            } else {
                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                    return false;
                }
                i++;
                j--;
            }
        }

        return true;
    }

}
