# Last updated: 7/2/2026, 4:20:36 PM
1class Solution:
2    def lengthOfLastWord(self, s: str) -> int:
3        s=s.split()
4        return len(s[-1])
5        