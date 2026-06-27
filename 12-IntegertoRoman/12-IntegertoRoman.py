# Last updated: 6/27/2026, 12:08:39 PM
1class Solution:
2    def maxProduct(self, nums: List[int]) -> int:
3        n=len(nums)
4        m=nums[0]
5        for i in range(n):
6            p=1
7            for j in range (i,n):
8                p*=nums[j]
9                if p>m:
10                    m=p;
11        return m;
12        
13        
14        