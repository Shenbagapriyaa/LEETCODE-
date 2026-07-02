# Last updated: 7/2/2026, 4:18:23 PM
1class Solution:
2    def lengthOfLastWord(self, s: str) -> int:
3        s=s.strip().split()
4        return len(s[-1])
5        