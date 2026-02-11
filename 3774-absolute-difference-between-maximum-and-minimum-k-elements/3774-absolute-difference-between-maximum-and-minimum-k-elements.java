class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int lsum=0;
        int ssum=0;
        for(int i=0;i<k;i++){
            ssum+=nums[i];
        }
        for(int i=nums.length-1;i>=nums.length-k;i--){
            lsum+=nums[i];
        }
        return nums.length>1?Math.abs(lsum-ssum):0;
    }
}