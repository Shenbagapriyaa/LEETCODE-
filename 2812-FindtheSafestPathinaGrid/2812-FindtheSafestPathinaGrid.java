// Last updated: 7/1/2026, 4:06:40 PM
1class Solution {
2    int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
3
4    public int maximumSafenessFactor(List<List<Integer>> grid) {
5        int n = grid.size();
6        int[][] dist = new int[n][n];
7
8        for (int[] row : dist)
9            Arrays.fill(row, -1);
10
11        Queue<int[]> q = new LinkedList<>();
12
13        // Multi-source BFS
14        for (int i = 0; i < n; i++) {
15            for (int j = 0; j < n; j++) {
16                if (grid.get(i).get(j) == 1) {
17                    q.offer(new int[]{i, j});
18                    dist[i][j] = 0;
19                }
20            }
21        }
22
23        while (!q.isEmpty()) {
24            int[] cur = q.poll();
25
26            for (int[] d : dir) {
27                int x = cur[0] + d[0];
28                int y = cur[1] + d[1];
29
30                if (x >= 0 && y >= 0 && x < n && y < n && dist[x][y] == -1) {
31                    dist[x][y] = dist[cur[0]][cur[1]] + 1;
32                    q.offer(new int[]{x, y});
33                }
34            }
35        }
36
37        int low = 0, high = 2 * n;
38
39        while (low <= high) {
40            int mid = (low + high) / 2;
41
42            if (canReach(dist, mid)) {
43                low = mid + 1;
44            } else {
45                high = mid - 1;
46            }
47        }
48
49        return high;
50    }
51
52    boolean canReach(int[][] dist, int safe) {
53        int n = dist.length;
54
55        if (dist[0][0] < safe)
56            return false;
57
58        boolean[][] vis = new boolean[n][n];
59        Queue<int[]> q = new LinkedList<>();
60
61        q.offer(new int[]{0, 0});
62        vis[0][0] = true;
63
64        while (!q.isEmpty()) {
65            int[] cur = q.poll();
66
67            if (cur[0] == n - 1 && cur[1] == n - 1)
68                return true;
69
70            for (int[] d : dir) {
71                int x = cur[0] + d[0];
72                int y = cur[1] + d[1];
73
74                if (x >= 0 && y >= 0 && x < n && y < n &&
75                    !vis[x][y] && dist[x][y] >= safe) {
76
77                    vis[x][y] = true;
78                    q.offer(new int[]{x, y});
79                }
80            }
81        }
82
83        return false;
84    }
85}