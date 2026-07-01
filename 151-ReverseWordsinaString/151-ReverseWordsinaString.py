# Last updated: 7/1/2026, 11:20:41 AM
1class Solution(object):
2    def reverseWords(self, s):
3        return " ".join(s.split() [::-1])
4        