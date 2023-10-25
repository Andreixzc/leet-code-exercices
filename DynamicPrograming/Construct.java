package DynamicPrograming;

import java.util.HashMap;

public class Construct {
    public static void main(String[] args) {
        String str = "aaaaaaaaaab";
        String[] strVet = { "a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa"};
        System.out.println(canConstruct(str, strVet));
    }

    public static boolean canConstruct(String str, String[] arr) {
        HashMap<String, Boolean> hashMap = new HashMap<>();
        return canConstruct(str, arr, hashMap);
    }

    public static boolean canConstruct(String target, String[] stringbank, HashMap<String, Boolean> hash) {

        if (hash.containsKey(target)) {
            return hash.get(target);
        }
        if (target.length() == 0) {
            return true;
        }
        if (target.length() == 1) {
            return false;
        }

        for (int i = 0; i < stringbank.length; i++) {
            if (target.startsWith(stringbank[i])) {
                String newStr = target.replaceFirst(stringbank[i], "");
                if (canConstruct(newStr, stringbank)) {
                    return true;
                }
            }

        }
        hash.put(target, false);
        return false;

    }
}
