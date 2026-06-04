// Last updated: 6/4/2026, 6:16:36 PM
1class Solution {
2    public boolean isPowerOfThree(int n) {
3        if(n<=0)
4        return false;
5        if(n==1)
6        return true;
7        if(n%3!=0)
8        return false;
9        return isPowerOfThree(n/3);
10    }
11}