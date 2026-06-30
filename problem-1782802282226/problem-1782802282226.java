// Last updated: 6/30/2026, 12:21:22 PM
1class Solution {
2    public int numberOfSubstrings(String s) {
3        int[] c=new int[3];
4        int l=0;
5        int ans=0;
6        for(int r=0;r<s.length();r++){
7           c[ s.charAt(r)-'a']++;
8           while(c[0]>0 && c[1]>0 &&c[2]>0){
9           ans+=s.length()-r;
10            c[ s.charAt(l)-'a']--;
11            l++;
12        }
13        }
14        return ans;
15        
16    }
17}