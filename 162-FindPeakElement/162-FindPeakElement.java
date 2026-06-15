// Last updated: 6/15/2026, 3:15:45 PM
1class Solution {
2    public int findPeakElement(int[] nums) {
3        for(int i=0;i<nums.length-1;i++){
4            if(nums[i]>nums[i+1]){
5                return i;
6            }
7        }
8        return nums.length-1;
9    }
10}