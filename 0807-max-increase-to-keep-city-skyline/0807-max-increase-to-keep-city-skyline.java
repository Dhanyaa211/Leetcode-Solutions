class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] rowMax=new int[grid.length];
        int[] colMax=new int[grid[0].length];
        int[] res=new int[rowMax.length*colMax.length];
        int sum=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                int row=grid[i][j];
                rowMax[i]=Math.max(row,rowMax[i]);
            }
        }
        for(int i=0;i<grid[0].length;i++){
            for(int j=0;j<grid.length;j++){
                int col=grid[j][i];
                colMax[i]=Math.max(col,colMax[i]);
            }
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int allowed = Math.min(rowMax[i], colMax[j]);
                sum += allowed - grid[i][j];
            }
        }
        return sum;
    }
}