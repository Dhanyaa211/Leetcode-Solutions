class Solution {
    public int singleNumber(int[] nums) {
        // int xor=nums[0];
        // for (int i=1; i<nums.length;i++){
        //     xor^=nums[i];           
        //     }
        //     return xor;
        // }
        // public static void main(String[] args){
        // int[] nums= new int[]{2,2,1};
        // Solution s1= new Solution();
        // s1.singleNumber(nums);
        int count=0;
        Arrays.sort(nums);
        int val=nums[0];
        for(int i=0;i<nums.length;i++){
            if(i+1<nums.length&&nums[i]==nums[i+1]){
                count++;
            }
            else{
                if(count==1){
                    val=nums[i];
                }
                count=1;
            }
        }
        return val;
    }
    }
    
