class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // boolean res=false;
        // for (int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[i].length;j++){
        //         if(matrix[i][j]==target) res=true;
        //     }
        // }
        // return res;
        int m=matrix.length;
        int n=matrix[0].length;
        int row=0;
        int col=n-1;
        while(row<m && col>=0){
            if(matrix[row][col]==target) return true;
            else if(matrix[row][col]>target) col--;
            else row++;
        }
        return false;
    }
}