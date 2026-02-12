class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int sum = 0;

        // modified loop
        for (int key : freq.keySet()) {
            int count = freq.get(key);
            if (count % k == 0) {
                sum += key * count;
            }
        }

        return sum;
    }
}
