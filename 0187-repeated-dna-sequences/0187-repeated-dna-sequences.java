import java.util.*;

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> seen = new HashSet<>();   // stores sequences we've seen once
        Set<String> repeated = new HashSet<>(); // stores sequences that repeat

        for (int i = 0; i <= s.length() - 10; i++) {
            String sequence = s.substring(i, i + 10); // get 10-letter substring
            if (!seen.add(sequence)) {  // if add returns false, sequence is repeated
                repeated.add(sequence);
            }
        }

        return new ArrayList<>(repeated); // convert set to list
    }
}
