// class Solution {
//     public int removeDuplicates(int[] nums) {
//         int ans=0;
//         int index=0;
//         HashSet<Integer> asserted= new HashSet<>();
//         for (int i=0; i<nums.length; i++){
//             if (!asserted.contains(nums[i])) {
//                 asserted.add(nums[i]);
//                 nums[index] = nums[i]; // Place the unique number in the array
//                 index++; // Move to the next position
//             }

//         }
//         ans=asserted.size();
//         return ans;
//     }
// }
class Solution {
    public int removeDuplicates(int[] nums) {
      int c=0;
      int p=101;
      for(int i=0; i<nums.length;i++){
        if(nums[i]!=p){
            p=nums[i];
            nums[c++]=p;
        }
      }
      return c;
    }
}

