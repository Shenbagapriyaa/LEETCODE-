# Last updated: 6/22/2026, 1:58:13 PM
1class Solution(object):
2    def reverseVowels(self, s):
3        v = [c for c in s if c in "aeiouAEIOU"][::-1]
4        j = 0
5        res = ""
6
7        for c in s:
8            if c in "aeiouAEIOU":
9                res += v[j]
10                j += 1
11            else:
12                res += c
13
14        return res