// Last updated: 6/4/2026, 10:04:28 PM
1class Solution {
2    public int totalWaviness(int num1, int num2) {
3        int c = 0;
4
5        for (int n = num1; n <= num2; n++) {
6            int temp = n;
7            int arr[] = new int[100];
8            int len = 0;
9
10            while (temp != 0) {
11                arr[len++] = temp % 10;
12                temp /= 10;
13            }
14
15            for (int i = len - 2; i >= 1; i--) {
16                int l = arr[i + 1];
17                int m = arr[i];
18                int r = arr[i - 1];
19
20                if (m > l && m > r) {
21                    c++;
22                } else if (m < l && m < r) {
23                    c++;
24                }
25            }
26        }
27        return c;
28    }
29}