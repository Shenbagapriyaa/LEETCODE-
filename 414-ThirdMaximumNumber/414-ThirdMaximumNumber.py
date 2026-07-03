# Last updated: 7/3/2026, 10:34:08 AM
1class Solution(object):
2    def thirdMax(self, nums):
3        s=set(nums)
4        if(len(s)<3):
5            return max(s)
6        s.remove(max(s))
7        s.remove(max(s))
8        return max(s)
9        