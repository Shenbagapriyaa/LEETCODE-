// Last updated: 6/4/2026, 1:18:34 PM
class Solution {
    public int[][] generateMatrix(int n) {
      int[][] mat=new int[n][n];
      int v=1;
      int left=0,right=n-1,top=0,bottom=n-1;
      while(v<=n*n){
        for(int i=left;i<=right;i++){
            mat[top][i]=v++;
        }
        top++;
        for(int i=top;i<=bottom;i++){
            mat[i][right]=v++;
        }
        right--;
        for(int i=right;i>=left;i--){
            mat[bottom][i]=v++;
        }
        bottom--;
        for(int i=bottom;i>=top;i--){
            mat[i][left]=v++;
        }
        left++;
      }  
      return mat;
    }
}



