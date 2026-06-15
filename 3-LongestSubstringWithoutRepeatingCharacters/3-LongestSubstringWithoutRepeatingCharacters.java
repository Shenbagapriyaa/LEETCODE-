// Last updated: 6/15/2026, 9:37:05 AM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        HashSet<Character> set=new HashSet<>();
4        int left =0;
5        int maxlen=0;
6        for(int right=0;right<s.length();right++){
7            while(set.contains(s.charAt(right))){
8                set.remove(s.charAt(left));
9                left++;
10            }
11            set.add(s.charAt(right));
12            maxlen = Math.max(maxlen, right - left + 1);
13
14            }
15
16        
17        return maxlen;
18    }
19}