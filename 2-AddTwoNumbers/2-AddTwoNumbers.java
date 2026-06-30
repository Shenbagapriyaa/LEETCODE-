// Last updated: 6/30/2026, 1:54:49 PM
1class Solution {
2    public int titleToNumber(String s) {
3         int ans = 0;
4        for (int i = 0; i < s.length(); i++) {
5            ans=ans*26+(s.charAt(i)-'A'+1);
6        }
7        return ans;
8    }
9   
10}