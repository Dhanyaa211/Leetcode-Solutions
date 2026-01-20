class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>()); // start with empty subset

        for (int num : nums) {
            int n = res.size();
            for (int i = 0; i < n; i++) {
                // take existing subset and add current number
                List<Integer> newSubset = new ArrayList<>(res.get(i));
                newSubset.add(num);
                res.add(newSubset);
            }
        }

        return res;
    }
}