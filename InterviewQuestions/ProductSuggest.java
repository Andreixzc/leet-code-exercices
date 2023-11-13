package InterviewQuestions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductSuggest {

    public static void main(String[] args) {
        String word = "mouse";
        String[] products = { "mobile", "mouse", "moneypot", "monitor", "mousepad" };
       System.out.println(suggestedProducts(products, word));
        // [["mobile","moneypot","monitor"],["mobile","moneypot","monitor"],
    }
    public static List<List<String>> suggestedProducts(String[] products, String searchWord) {
        StringBuilder sb = new StringBuilder();
        List<List<String>> output = new ArrayList<>();

        for (int i = 0; i < searchWord.length(); i++) {
            sb.append(searchWord.charAt(i));
            List<String> matches = new ArrayList<>();

            for (int j = 0; j < products.length; j++) {
                if (products[j].startsWith(sb.toString())) {
                    matches.add(products[j]);
                }
            }
            Collections.sort(matches);
            List<String> aux = new ArrayList<>();
            for (int j = 0; j < 3 && j < matches.size(); j++) {
                aux.add(matches.get(j));
            }
    
            output.add(aux);
            matches.clear();

            
        }

        return output;
    }

}