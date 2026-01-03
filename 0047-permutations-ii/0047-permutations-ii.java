class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> mainRow= new ArrayList<>();
        Arrays.sort(nums);
        back(nums,new ArrayList<>(),mainRow, new boolean[nums.length]);
        return mainRow;
    }
    public void back(int[] nums, List<Integer> row,  List<List<Integer>> mainRow, boolean[] used ){
        if(row.size()==nums.length && !mainRow.contains(row)){
            mainRow.add(new ArrayList<>(row));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]){
                continue;
            }
            used[i]=true;
            row.add(nums[i]);
            back(nums,row,mainRow,used);
            used[i]=false;
            row.remove(row.size()-1);
        }
    }
}