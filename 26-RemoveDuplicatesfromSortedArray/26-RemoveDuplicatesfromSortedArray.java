// Last updated: 6/16/2026, 2:34:05 PM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        if(nums.length<=2){
4            return nums.length;
5        }
6        int k=2;
7        for(int i=2;i<nums.length;i++){
8            if(nums[i]!=nums[k-2]){
9                nums[k]=nums[i];
10                k++;
11            }
12        }
13        return k;
14    }
15}