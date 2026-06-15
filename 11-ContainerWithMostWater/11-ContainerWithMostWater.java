// Last updated: 6/15/2026, 10:57:50 AM
1class Solution {
2    public int maxArea(int[] height) {
3
4        int left = 0;
5        int right = height.length - 1;
6        int maxArea = 0;
7
8        while (left < right) {
9
10            int h;
11
12            if (height[left] < height[right])
13                h = height[left];
14            else
15                h = height[right];
16
17            int area = h * (right - left);
18
19            if (area > maxArea)
20                maxArea = area;
21
22            if (height[left] < height[right])
23                left++;
24            else
25                right--;
26        }
27
28        return maxArea;
29    }
30}