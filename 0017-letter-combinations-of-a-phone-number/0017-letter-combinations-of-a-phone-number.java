import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.length() == 0) return result;

        // Step 1: Create Map
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        backtrack(digits, 0, new StringBuilder(), map, result);
        return result;
    }

    private void backtrack(String digits, int index, StringBuilder current,
                           Map<Character, String> map, List<String> result) {

        // Base case
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = map.get(digits.charAt(index));

        for (char c : letters.toCharArray()) {
            current.append(c);
            backtrack(digits, index + 1, current, map, result);
            current.deleteCharAt(current.length() - 1); // backtrack
        }
    }
}
