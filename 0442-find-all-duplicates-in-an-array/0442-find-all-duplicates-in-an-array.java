class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                set.add(nums[i]);
            }
        }
        List<Integer> list = new ArrayList<>(set);

        return list;
        }
    }
