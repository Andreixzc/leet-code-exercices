package Stack;

import java.util.Stack;

public class Parenthesis {
    public static void main(String[] args) {
        String str = "()";
        System.out.println(isValid(str));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
                stack.push(currentChar);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char topChar = stack.pop();

                if ((currentChar == ')' && topChar != '(') ||
                        (currentChar == ']' && topChar != '[') ||
                        (currentChar == '}' && topChar != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
