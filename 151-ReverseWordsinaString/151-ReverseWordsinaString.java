// Last updated: 7/1/2026, 11:17:06 AM
1class Solution {
2    public String reverseWords(String s) {
3        String arr[]=s.split(" ");
4        String ans="";
5        for(int i=arr.length-1;i>=0;i--){
6            if(!arr[i].equals("")){
7                ans+=arr[i]+" ";
8            }
9        }
10        return ans.trim();
11    }
12}
13