class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);  // IMPORTANT

        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());

        int start = 0, end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = 0;

            // if duplicate, only use subsets added in previous step
            if (i > 0 && nums[i] == nums[i - 1]) {
                start = end + 1;
            }

            end = res.size() - 1;

            for (int j = start; j <= end; j++) {
                List<Integer> newSubset = new ArrayList<>(res.get(j));
                newSubset.add(nums[i]);
                res.add(newSubset);
            }
        }
        return res;
    }
}
