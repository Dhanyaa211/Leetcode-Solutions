class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];
        int top=0;
        int left=0;
        int right=n-1;
        int bottom=n-1;
        int pos=1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                matrix[top][i]=pos++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                matrix[i][right]=pos++;
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                matrix[bottom][i]=pos++;
            }
            bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                matrix[i][left]=pos++;
            }
            left++;
            }
        }
        return matrix;
    }
}