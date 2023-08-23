import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import javax.swing.RowFilter.Entry;

public class Main {
    public static void main(String[] args) {
        // int[] vet = {100, 4, 200, 1, 3, 2};
        int[] vet = { 2, 2, 1, 1, 1, 2, 5, 5, 8, 9 };
        topKFrequent(vet, 2);

    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
            if (hashMap.get(nums[i]) > 1) {
                return true;
            }

        }
        return false;
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;

        } else {
            HashMap<Character, Integer> hashMap1 = new HashMap<>();
            HashMap<Character, Integer> hashMap2 = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                hashMap1.put(s.charAt(i), hashMap1.getOrDefault(s.charAt(i), 0) + 1);
                hashMap2.put(t.charAt(i), hashMap2.getOrDefault(t.charAt(i), 0) + 1);
            }
            return hashMap1.equals(hashMap2);

        }
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] res = new int[2];
        int complemento = 0;
        for (int i = 0; i < nums.length; i++) {
            complemento = target - nums[i];
            if (hashMap.containsKey(complemento)) {
                res[0] = i;
                res[1] = hashMap.get(complemento);

            }
            hashMap.put(nums[i], i);
        }
        return res;
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            int vet[] = new int[26];// vetor de ocorrencias
            for (int j = 0; j < strs[i].length(); j++) {
                vet[strs[i].charAt(j) - 'a']++; // acha a possivel do char, e incrementa
            }
            StringBuilder currentKey = new StringBuilder();
            for (int j = 0; j < vet.length; j++) {
                currentKey.append(vet[j]);
                currentKey.append('#');// Adicionar # para o caso do corner case de haver mais de 10
                                       // repeticoes
            }
            if (hashMap.containsKey(currentKey.toString())) {
                hashMap.get(currentKey.toString()).add(strs[i]);
            } else {
                List<String> anagramList = new ArrayList<>();
                anagramList.add(strs[i]);
                hashMap.put(currentKey.toString(), anagramList);
            }

        }
        return new ArrayList<>(hashMap.values());

    }

    public static int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> hashMap = new HashMap<>();
        int[] retorno = new int[k];
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.get(nums[i]) == null) {
                hashMap.put(nums[i], 1);
            } else {
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
            }
        }

        System.out.println(hashMap.entrySet());
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(hashMap.entrySet());
        Comparator<Map.Entry<Integer, Integer>> comparator = (entry1, entry2) -> entry2.getValue()
                .compareTo(entry1.getValue());
        Collections.sort(entryList, comparator);
        for (int i = 0; i < k; i++) {
            retorno[i] = entryList.get(i).getKey();
        }
        return retorno;

    }

    // public static int[] productExceptSelf(int[] nums) {
    // int[] pre = new int[nums.length];
    // int[] pos = new int[nums.length];
    // int[] output = new int[nums.length];
    // pre[0] = nums[0];
    // pos[pos.length - 1] = nums[pos.length - 1];
    // for (int i = 0; i < nums.length; i++) {

    // }

    // }
    public static int longestConsecutive(int[] nums) {
        int len = 0;
        if (nums.length == 1) {
            return 1;
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            heap.add(nums[i]);
        }
        Integer current = heap.poll();
        int currentLen = 1;

        while (!heap.isEmpty()) {
            Integer currentNext = heap.poll();

            if (currentNext - 1 == current) {
                currentLen++;
            } else if (currentNext != current) {
                currentLen = 1;
            }
            current = currentNext;
            len = Math.max(len, currentLen);
        }

        return len;
    }

}
