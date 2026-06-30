// Last updated: 6/30/2026, 12:34:29 PM
1class Solution {
2    public int findMin(int[] nums) {
3        Arrays.sort(nums);
4        int min=nums[0];
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]<min)
7            min=nums[i];
8        }
9        return min;
10        
11    }
12}