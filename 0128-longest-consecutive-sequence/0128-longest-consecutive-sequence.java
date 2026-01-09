class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        int max=1;
        if(nums.length==0) return 0;
        for(int i=0;i<nums.length-1;i++){
            if (nums[i] == nums[i + 1]) {
                continue; // skip duplicates
            }
            else if (nums[i] + 1 == nums[i + 1]) {
                count++;
            }
            else {
                max = Math.max(max, count);
                count = 1;
            }
        }

        // Final update
        max = Math.max(max, count);
        return max;
    }
}