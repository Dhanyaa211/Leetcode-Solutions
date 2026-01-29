import java.util.*;

class Solution {
    public int getLeastFrequentDigit(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        String s = Integer.toString(n);

        // count frequency
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            if (!map.containsKey(digit))
                map.put(digit, 1);
            else
                map.put(digit, map.get(digit) + 1);
        }

        int min = Integer.MAX_VALUE;
        int result = 0;
        for (int key : map.keySet()) {
            if (map.get(key) < min) {
                min = map.get(key);
                result = key;
            }
        }

        return result;
    }
}
