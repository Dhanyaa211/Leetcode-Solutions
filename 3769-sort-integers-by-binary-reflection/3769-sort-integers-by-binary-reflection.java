class Solution {
    public int[] sortByReflection(int[] nums) {
        String[] binary=new String[nums.length];
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            String org=Integer.toBinaryString(nums[i]);
            binary[i]=new StringBuilder(org).reverse().toString();
            ans[i]=Integer.parseInt(binary[i], 2);
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (ans[i] > ans[j] || 
                   (ans[i] == ans[j] && nums[i] > nums[j])) {

                    // swap reflection
                    int temp = ans[i];
                    ans[i] = ans[j];
                    ans[j] = temp;

                    // swap original numbers
                    int t = nums[i];
                    nums[i] = nums[j];
                    nums[j] = t;
                }
            }
        }

        return nums;
    }
}