// Last updated: 6/16/2026, 2:16:47 PM
1class Solution {
2    HashSet<String> set = new HashSet<>();
3    public boolean wordBreak(String s, List<String> wordDict) {
4        if(s.length() == 0)
5            return true;
6        if(set.contains(s))
7            return false;
8        for(int i = 0; i < wordDict.size(); i++) {
9            String word = wordDict.get(i);
10            if(s.startsWith(word)) {
11                if(wordBreak(s.substring(word.length()), wordDict))
12                    return true;
13            }
14        }
15        set.add(s);
16        return false;
17    }
18}