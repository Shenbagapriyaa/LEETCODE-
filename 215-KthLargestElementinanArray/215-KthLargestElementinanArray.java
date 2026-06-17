// Last updated: 6/17/2026, 2:35:07 PM
1class Solution {
2    public int firstUniqChar(String s) {
3        int[] charCount = new int[26]; 
4        for (char c : s.toCharArray()) {
5            charCount[c - 'a']++;
6        }
7        for (int i = 0; i < s.length(); i++) {
8            if (charCount[s.charAt(i) - 'a'] == 1) {
9                return i; 
10            }
11        }
12        return -1;
13    }
14} 