class Solution {
    public int maxSubArray(int[] nums) {
        int left = 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            maxSum=Math.max(maxSum,sum);
            if(sum<0){
                sum=0;
                left=right+1;
            }
        }
        return maxSum;
    }
}