import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Produc {

    public static void main(String[] args) {
        String word = "mouse";
        String[] products = { "mobile", "mouse", "moneypot", "monitor", "mousepad" };
        suggestedProducts(products, word);
        // [["mobile","moneypot","monitor"],["mobile","moneypot","monitor"],
    }
    public static List<List<String>> suggestedProducts(String[] products, String searchWord) {
        //pra cada palavra, formar as listas de correspondencias..
        List<List<String>> output = new ArrayList<>();

        for (int i = 0; i < products.length; i++) {
            List<String> list = new LinkedList<>();
            for (int j = 0; j < products.length; j++) {
                if (products[j].charAt(i) == searchWord.charAt(i)) {
                    list.add(products[j]);
                }
            }
            output.add(list);

        }
        System.out.println(output.toString());
        return output;
    }

}