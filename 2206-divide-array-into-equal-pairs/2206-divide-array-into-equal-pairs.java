class Solution {
    public boolean divideArray(int[] nums) {
        if(nums.length%2 ==1) return false;
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length){
            if(nums[i]!=nums[i+1]){
                return false;
            }
            i+=2;
        }
        return true;
    }
}