package Random;

public class Happy {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    public static boolean isHappy(int n) {
        int count = 0;
        do {
            n = (n * n) + (n * n);
            if (n == 1) {
                count++;
            }
            if (count == 2) {
                return true;
            }
        } while (n > 0 || count == 2);
        return false;
    }

}
