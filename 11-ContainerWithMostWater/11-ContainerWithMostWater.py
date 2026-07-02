# Last updated: 7/2/2026, 10:04:59 AM
1class Solution(object):
2    def repeatedSubstringPattern(self, s):
3        return s in(s+s)[1:-1]
4        