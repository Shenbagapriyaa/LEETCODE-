// Last updated: 7/1/2026, 11:34:56 AM
1class Solution {
2    public int missingNumber(int[] nums) {
3        int n=nums.length;
4        int sum=0;
5        int tot = n*(n+1)/2;
6        for(int i=0;i<n;i++){
7            sum+=nums[i];
8        }
9        return tot-sum;
10        
11    }
12}