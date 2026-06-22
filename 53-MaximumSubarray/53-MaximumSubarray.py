# Last updated: 6/22/2026, 2:37:25 PM
1class Solution(object):
2    def maxSubArray(self, nums):
3        max_sum=nums[0]
4        curr_sum=nums[0]
5        for i in range(1,len(nums)):
6            curr_sum=max(nums[i],curr_sum+nums[i])
7            max_sum=max(max_sum,curr_sum)
8        return max_sum;
9        