class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Arrays.sort(nums);
        int xor=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                xor^=nums[i];
            }
        }
        return xor;
    }
}