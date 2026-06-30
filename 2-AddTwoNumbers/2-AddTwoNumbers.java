// Last updated: 6/30/2026, 2:15:16 PM
1class Solution {
2    public boolean checkXMatrix(int[][] grid) {
3        int n=grid.length;
4        for(int i=0;i<n;i++){
5            for(int j=0;j<n;j++){
6                if(i==j || i+j==n-1){
7                   if( grid[i][j]==0){
8                    return false;
9                   }
10                }
11                   else{
12                    if( grid[i][j]!=0){
13                        return false;
14                    }
15                   
16
17                }
18            }
19        }
20        return true;
21    }
22}