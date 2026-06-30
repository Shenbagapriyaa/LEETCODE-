# Last updated: 6/30/2026, 11:53:50 AM
1class Solution:
2    def maxVowels(self, s: str, k: int) -> int:
3        v = "aeiou"
4        count = 0
5
6        for i in range(k):
7            if s[i] in v:
8                count += 1
9
10        ans = count
11
12        for i in range(k, len(s)):
13            if s[i - k] in v:
14                count -= 1
15            if s[i] in v:
16                count += 1
17            ans = max(ans, count)
18
19        return ans