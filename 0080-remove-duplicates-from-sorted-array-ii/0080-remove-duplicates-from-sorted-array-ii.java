class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;

        int pos = 2;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[pos - 2]) {
                nums[pos] = nums[i];
                pos++;
            }
        }

        return pos;
    }
}
