package ArraysAndHashing;
import java.util.ArrayList;
import java.util.List;

public class EncodeDecodeString {
    public static void main(String[] args) {
        List<String> subList1 = new ArrayList<>();
        subList1.add("element11");
        subList1.add("element12");
        subList1.add("element13");
        System.out.println(encode(subList1));
        System.out.println(decode(encode(subList1)).toString());


    }

    public static String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String string : strs) {
            sb.append(string.length());
            sb.append("#");
            sb.append(string);
        }
        return sb.toString();
    }

    public static List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') j++;

            int length = Integer.valueOf(str.substring(i, j));
            i = j + 1 + length;
            list.add(str.substring(j + 1, i));
        }
        return list;
    }
    


}


