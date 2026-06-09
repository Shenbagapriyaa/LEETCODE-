// Last updated: 6/9/2026, 3:53:47 PM
1class Solution {
2    public boolean isPalindrome(int x) { 
3        int org=x;
4        int rev=0;
5        while(x>0){
6            int rem=x%10;
7            rev=rev*10+rem;
8            x/=10;
9        }
10        if(rev==org){
11            return true;
12        }
13        else{
14            return false;
15        }
16    }
17}