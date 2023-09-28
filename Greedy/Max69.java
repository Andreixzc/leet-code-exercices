package Greedy;

public class Max69 {
    public static void main(String[] args) {
        System.out.println(maximum69Number(669));
    }

    public static int maximum69Number(int num) {
        StringBuilder sb = new StringBuilder(String.valueOf(num));

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '6') {
                sb.setCharAt(i, '9');
                break; 
            }
        }
        return Integer.valueOf(sb.toString());
    }
}
