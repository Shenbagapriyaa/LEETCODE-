// Last updated: 7/1/2026, 2:17:33 PM
1class Solution {
2    public int numSquares(int n) {
3
4        if (isSquare(n))
5            return 1;
6
7        for (int i = 1; i * i <= n; i++) {
8            if (isSquare(n - i * i))
9                return 2;
10        }
11
12        while (n % 4 == 0)
13            n /= 4;
14
15        if (n % 8 == 7)
16            return 4;
17
18        return 3;
19    }
20
21    private boolean isSquare(int n) {
22        int x = (int) Math.sqrt(n);
23        return x * x == n;
24    }
25}