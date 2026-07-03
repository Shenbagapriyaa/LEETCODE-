# Last updated: 7/3/2026, 10:18:09 AM
1class Solution(object):
2    def firstMissingPositive(self, nums):
3        s=set(nums)
4        i=1
5        while i in s:
6            i+=1
7        return i;
8        