class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> allowedSet = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            allowedSet.add(c);
        }

        int ans = 0;
        for (String word : words) {
            int j = 0;
            for (; j < word.length(); j++) {
                if (!allowedSet.contains(word.charAt(j))) {
                    break;
                }
            }
            if (j == word.length()) { // All characters were allowed
                ans++;
            }
        }

        return ans;
    }
}
