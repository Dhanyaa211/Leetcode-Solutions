class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : nums) {
            set.add(num); 
        }
        int size = Math.min(k, set.size());
        int[] ans = new int[size];
        int idx = 0;
        for (int num : set.descendingSet()) {
            if (idx == size) break;
            ans[idx++] = num;
        }
        return ans;
    }
}
