// Last updated: 6/25/2026, 3:54:13 PM
1class Solution {
2    public int maxArea(int[] height) {
3        int l = 0;
4        int r = height.length - 1;
5        int maxArea = 0;
6        while(l<r){
7            int w=r-l;
8            int h=Math.min(height[l],height[r]);
9            int area=w*h;
10            if(area>maxArea){
11                maxArea=area;
12            }
13            if(height[l]<height[r]){
14                l++;
15            }
16            else{
17                r--;
18            }
19        }
20        return maxArea;
21    }
22}