// Last updated: 6/4/2026, 1:18:32 PM
class Solution {
    public int minPathSum(int[][] grid) {
         return  minCostItertive(grid);
    }
    public  int minCostItertive(int [][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int [][] dp = new int[rows+1][cols+1];

        for(int i=0;i<dp.length;i++){
                for(int j=0; j<dp[i].length;j++){
                    dp[i][j]=Integer.MAX_VALUE;
                }
        }

        for (int i = rows-1; i>=0; i--){
            for(int j= cols-1;j>=0;j--){
                if(i == rows-1 && j == cols-1){
                    dp[i][j] = matrix[i][j];
                    continue;
                }
                int right = dp[i][j+1];
                int down = dp[i+1][j];
                dp[i][j] = matrix[i][j]+ Math.min(right,down);
            }
        }
        return dp[0][0];
    }
}

