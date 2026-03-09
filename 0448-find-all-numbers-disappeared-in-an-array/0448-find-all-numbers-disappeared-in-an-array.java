class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int expected = 1;

        for(int i = 0; i < nums.length; i++){
            while(expected < nums[i]){
                ans.add(expected);
                expected++;
            }
            if(expected == nums[i]){
                expected++;
            }
        }

        while(expected <= nums.length){
            ans.add(expected);
            expected++;
        }
        return ans;
    }
}