class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] left= new int[nums.length];
        int[] right= new int[nums.length];
        int lsum=0;
        int rsum=0;
        for(int i=1;i<nums.length;i++){
            lsum+=nums[i-1];
            left[i]=lsum;
        }
        for(int i=nums.length-2;i>=0;i--){
            rsum+=nums[i+1];
            right[i]=rsum;
        }
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=Math.abs(left[i]-right[i]);
        }
        return ans;
    }
}