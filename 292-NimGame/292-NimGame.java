// Last updated: 7/1/2026, 3:44:55 PM
1class Solution {
2    public int numSquares(int n) {
3        if (isSquare(n))
4            return 1;
5
6        for (int i = 1; i * i <= n; i++) {
7            if (isSquare(n - i * i))
8                return 2;
9        }
10
11        while (n % 4 == 0)
12            n /= 4;
13
14        if (n % 8 == 7)
15            return 4;
16
17        return 3;
18    }
19
20    private boolean isSquare(int n) {
21        int x = (int) Math.sqrt(n);
22        return x * x == n;
23    }
24}