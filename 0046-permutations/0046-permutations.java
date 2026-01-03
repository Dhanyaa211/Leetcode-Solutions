class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> mainRow= new ArrayList<>();
        back(nums,new ArrayList<>(),mainRow);
        return mainRow;
    }
    public void back(int[] nums, List<Integer> row,  List<List<Integer>> mainRow ){
        if(row.size()==nums.length){
            mainRow.add(new ArrayList<>(row));
            return;
        }
        for(int num:nums){
            if(row.contains(num)){
                continue;
            }
            row.add(num);
            back(nums,row,mainRow);
            row.remove(row.size()-1);
        }
    }
}