class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);

        int num = nums[0];
        int max = 1;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count > max) {
                max = count;
                num = nums[i];
            }
        }

        return num;
    }
}
