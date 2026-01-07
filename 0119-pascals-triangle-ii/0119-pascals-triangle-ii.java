class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>>  mainRow= new ArrayList();
        for (int i=0; i<=rowIndex; i++)
        {
            List<Integer> row= new ArrayList();
            for( int j=0; j<=i;j++){
                if(j==0||j==i){
                    row.add(1);
                }
                else{
                    List<Integer> prev= mainRow.get(i-1);
                    row.add(prev.get(j)+prev.get(j-1));
                }
            }
            mainRow.add(row);
        }
        return mainRow.get(rowIndex);
    }
    public static void main(String[] args){
        Solution s= new Solution();
        List<Integer> result=s.getRow(3);
        System.out.print(result);
    }
}