# Last updated: 7/1/2026, 4:32:18 PM
1class Solution(object):
2    def repeatedSubstringPattern(self, s):
3        return s in(s+s)[1:-1]
4        