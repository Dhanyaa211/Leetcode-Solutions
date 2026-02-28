class Solution {
    public int subsetXORSum(int[] nums) {
        int or = 0;
        int n=nums.length;
        // OR all elements
        for (int num : nums) {
            or |= num;
        }
        
        return (int)(or * Math.pow(2, n - 1));
    }
}