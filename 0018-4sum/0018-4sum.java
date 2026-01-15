// class Solution {
//     public List<List<Integer>> fourSum(int[] nums, int target) {
//         List<List<Integer>> res=new ArrayList<>();
//         for(int i=0;i<nums.length-4;i++){
//             List<Integer> mes=new ArrayList<>();
//             int sum=0;
//             for(int j=i;j<i+4;j++){
//                 sum+=nums[j];
//                 mes.add(nums[j]);
//             }
//             if(sum==target){
//                 Collections.sort(mes);
//                 res.add(mes);
//             }
//         }
//         return res;
//     }
// }

// class Solution {
//     public List<List<Integer>> fourSum(int[] nums, int target) {
//         Set<List<Integer>> res = new HashSet<>();
//         int n = nums.length;
        
//         for(int i = 0; i < n - 3; i++){
//             for(int j = i + 1; j < n - 2; j++){
//                 for(int k = j + 1; k < n - 1; k++){
//                     for(int l = k + 1; l < n; l++){
//                         long sum = (long)nums[i] + nums[j] + nums[k] + nums[l];
                        
//                         if(sum == target){
//                             List<Integer> temp = new ArrayList<>();
//                             temp.add(nums[i]);
//                             temp.add(nums[j]);
//                             temp.add(nums[k]);
//                             temp.add(nums[l]);
//                             Collections.sort(temp);
//                             res.add(temp);
//                         }
//                     }
//                 }
//             }
//         }
//         return new ArrayList<>(res);
//     }
// }

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for(int i = 0; i < n - 3; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;

            for(int j = i + 1; j < n - 2; j++){
                if(j > i + 1 && nums[j] == nums[j - 1]) continue;

                int left = j + 1, right = n - 1;

                while(left < right){
                    long sum = (long)nums[i] + nums[j] + nums[left] + nums[right];

                    if(sum == target){
                        res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        while(left < right && nums[left] == nums[left + 1]) left++;
                        while(left < right && nums[right] == nums[right - 1]) right--;

                        left++;
                        right--;
                    }
                    else if(sum < target){
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }
        }
        return res;
    }
}

