class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int[] ans = new int[2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                int up = (i > 0) ? mat[i - 1][j] : -1;
                int down = (i < n - 1) ? mat[i + 1][j] : -1;
                int left = (j > 0) ? mat[i][j - 1] : -1;
                int right = (j < m - 1) ? mat[i][j + 1] : -1;

                if (mat[i][j] > up &&
                    mat[i][j] > down &&
                    mat[i][j] > left &&
                    mat[i][j] > right) {

                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }
}
