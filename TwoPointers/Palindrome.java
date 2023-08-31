package TwoPointers;

public class Palindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(s.charAt(19));
        System.out.println(s.charAt(4));
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        
    }

    public static boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int j = str.length() - 1;
        int i = 0;
        while (i <= j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
