// Last updated: 7/2/2026, 5:36:22 PM
1class Solution {
2    public int majorityElement(int[] nums) {
3        int n=nums.length;
4        for(int i=0;i<n;i++){
5           int c=0;
6           for(int j=0;j<n;j++){
7            if(nums[i]==nums[j]){
8                c++;
9            }
10           }
11            if(c>n/2){
12               return nums[i];
13            }
14           }
15           return -1;
16    }
17}