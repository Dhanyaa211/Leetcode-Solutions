class Solution {
    public List<List<Integer>> combinationSum2(int[] c, int t) {
        List<List<Integer>> mainRow= new ArrayList<>();
        Arrays.sort(c);
        back(c,t,0,new ArrayList<>(),mainRow);
        return mainRow;
    }
    private void back(int[] c, int t, int s, List<Integer> row,  List<List<Integer>> mainRow){
        if(t==0){
            mainRow.add(new ArrayList<>(row));
            return;
        }
        for(int i=s; i<c.length; i++){
            if(i>s && c[i]==c[i-1]){
                continue;
            }
            if(c[i]>t){
            break;
        }
        row.add(c[i]);
        back(c,t-c[i],i+1,row,mainRow);
        row.remove(row.size()-1);

        }
    }
}