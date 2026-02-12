class Solution {
    public String majorityFrequencyGroup(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        Map<Integer, List<Character>> groups = new HashMap<>();

        for (char ch : freq.keySet()) {
            int count = freq.get(ch);

            if (!groups.containsKey(count)) {
                groups.put(count, new ArrayList<>());
            }
            groups.get(count).add(ch);
        }

        int maxGroupSize = 0;
        int chosenFreq = 0;

        for (int k : groups.keySet()) {
            int size = groups.get(k).size();

            if (size > maxGroupSize ||
               (size == maxGroupSize && k > chosenFreq)) {
                maxGroupSize = size;
                chosenFreq = k;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : groups.get(chosenFreq)) {
            sb.append(ch);
        }

        return sb.toString();
    }
}
