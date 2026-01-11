class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        List<String> sortedList = new ArrayList<>();
        boolean[] used = new boolean[strs.length];

        // Step 1: Create sorted version list
        for (String word : strs) {
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            sortedList.add(new String(arr));
        }

        // Step 2: Compare sorted strings and group originals
        for (int i = 0; i < strs.length; i++) {
            if (used[i]) continue;

            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            used[i] = true;

            for (int j = i + 1; j < strs.length; j++) {
                if (!used[j] && sortedList.get(i).equals(sortedList.get(j))) {
                    group.add(strs[j]);
                    used[j] = true;
                }
            }

            result.add(group);
        }

        return result;
    }
}
