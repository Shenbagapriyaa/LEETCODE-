// Last updated: 7/1/2026, 1:59:40 PM
1class Solution {
2    public int climbStairs(int n) {
3        if(n<=0){
4            return 0;
5        }
6        if(n==1){
7            return 1;
8        }
9        if(n==2){
10            return 2;
11        }
12       int a=1;
13       int b=2;
14       for(int i=3;i<=n;i++){
15        int temp =a+b;
16        a=b;
17        b=temp;
18       } 
19       return b;
20    }
21}