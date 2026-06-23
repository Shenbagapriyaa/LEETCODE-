# Last updated: 6/23/2026, 11:33:11 AM
1class Solution(object):
2    def zeroFilledSubarray(self, nums):
3        c=0
4        ans=0
5        for i in nums:
6            if i==0 :
7                c+=1
8                ans+=c
9            else:
10                c=0;
11        return ans
12        