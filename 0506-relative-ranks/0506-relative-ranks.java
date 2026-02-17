import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] result = new String[n];
        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) idx[i] = i;
        Arrays.sort(idx, (a, b) -> Integer.compare(score[b], score[a]));
        for (int i = 0; i < n; i++) {
            if (i == 0) result[idx[i]] = "Gold Medal";
            else if (i == 1) result[idx[i]] = "Silver Medal";
            else if (i == 2) result[idx[i]] = "Bronze Medal";
            else result[idx[i]] = String.valueOf(i + 1);
        }

        return result;
    }
}
