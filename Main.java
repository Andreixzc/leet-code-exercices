

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        watermelon(n);
        sc.close();
    }

    public static void watermelon(int w) {
        if (w % 2 == 0) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
