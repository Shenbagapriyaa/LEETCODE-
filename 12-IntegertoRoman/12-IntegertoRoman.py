# Last updated: 6/27/2026, 10:21:30 AM
1class Solution:
2    def intToRoman(self, num: int) -> str:
3        sym=["M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"]
4        value=[1000,900,500,400,100,90,50,40,10,9,5,4,1]
5        ans=""
6        for i in range(len(sym)):
7            while num>=value[i]:
8                ans=ans+sym[i]
9                num=num-value[i]
10        return ans
11        