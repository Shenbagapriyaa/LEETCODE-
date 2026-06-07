// Last updated: 6/7/2026, 8:36:05 PM
1class Solution {
2    public int maxDistance(List<List<Integer>> arrays) {
3
4        int min = arrays.get(0).get(0);
5        int max = arrays.get(0).get(arrays.get(0).size() - 1);
6
7        int ans = 0;
8
9        for (int i = 1; i < arrays.size(); i++) {
10
11            int first = arrays.get(i).get(0);
12            int last = arrays.get(i).get(arrays.get(i).size() - 1);
13
14            ans = Math.max(ans, last - min);
15            ans = Math.max(ans, max - first);
16
17            min = Math.min(min, first);
18            max = Math.max(max, last);
19        }
20
21        return ans;
22    }
23}