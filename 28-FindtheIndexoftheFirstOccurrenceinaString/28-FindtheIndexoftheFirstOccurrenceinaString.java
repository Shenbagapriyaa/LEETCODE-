// Last updated: 6/16/2026, 2:57:09 PM
1class Solution {
2    public int strStr(String haystack, String needle) {
3       int n=needle.length();
4       int h=haystack.length();
5       for(int i=0;i<=h-n;i++){
6        if(haystack.substring(i,i+n).equals(needle)){
7            return i;
8
9        }
10
11       }
12       return -1;
13
14    }
15}