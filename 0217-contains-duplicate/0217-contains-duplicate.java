class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> res=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            res.add(nums[i]);
        }
        return nums.length!=res.size();
    }
}