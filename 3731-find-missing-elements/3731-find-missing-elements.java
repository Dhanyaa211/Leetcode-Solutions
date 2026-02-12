class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 != nums[i + 1]) {
                for (int val = nums[i] + 1; val < nums[i + 1]; val++) {
                    list.add(val);
                }
            }
        }
        return list;
    }
}
