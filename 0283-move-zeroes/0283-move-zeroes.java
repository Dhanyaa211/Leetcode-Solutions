class Solution {
    public void moveZeroes(int[] nums) {
        int pos=0;
        for(int i=0;i<nums.length;i++){
            if (nums[i]!=0){
                nums[pos]=nums[i];
                pos++;
            }
        }
        for(int i=pos+1;i<=nums.length;i++){
            nums[pos]=0;
            pos++;
        }
        System.out.println(nums);
    }
}