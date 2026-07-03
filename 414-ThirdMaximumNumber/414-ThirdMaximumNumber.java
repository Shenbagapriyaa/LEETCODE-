// Last updated: 7/3/2026, 11:23:45 AM
1class Solution {
2    public boolean isHappy(int n) {
3        HashSet<Integer>set=new HashSet<>();
4        while(n!=1 && !set.contains(n)){
5            set.add(n);
6            int s=0;
7            while(n>0){
8                int d=n%10;
9                s+=d*d;
10                n/=10;
11            }
12            n=s;
13        }
14        return n==1;
15    }
16}
17    