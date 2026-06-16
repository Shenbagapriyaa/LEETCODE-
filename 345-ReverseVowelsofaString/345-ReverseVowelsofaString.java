// Last updated: 6/16/2026, 2:15:08 PM
1class Solution {
2
3    HashSet<String> set = new HashSet<>();
4
5    public boolean wordBreak(String s, List<String> wordDict) {
6
7        if(s.length() == 0)
8            return true;
9
10        if(set.contains(s))
11            return false;
12
13        for(int i = 0; i < wordDict.size(); i++) {
14
15            String word = wordDict.get(i);
16
17            if(s.startsWith(word)) {
18
19                if(wordBreak(s.substring(word.length()), wordDict))
20                    return true;
21            }
22        }
23
24        set.add(s);
25        return false;
26    }
27}