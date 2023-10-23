package DynamicProgramming;

import java.math.BigInteger;
import java.util.HashMap;

public class NumberOfPaths {
    public static void main(String[] args) {
        System.out.println(paths(1000, 1000).toString());
    }

    public static BigInteger paths(int col, int row) {
        HashMap<String, BigInteger> hashMap = new HashMap<>();
        return paths(col, row, hashMap);
    }

    public static BigInteger paths(int col, int row, HashMap<String, BigInteger> hash) {
        String key = col + "," + row;
        if (hash.containsKey(key)) {
            return hash.get(key);
        }

        if (col == 1 || row == 1) {
            return BigInteger.ONE;
        }
        if (col == 0 || row == 0) {
            return BigInteger.ZERO;
        }

        BigInteger result = paths(col - 1, row, hash).add(paths(col, row - 1, hash));
        hash.put(key, result);
        return result;
    }
}
