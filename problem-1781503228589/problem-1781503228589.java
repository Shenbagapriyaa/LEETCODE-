// Last updated: 6/15/2026, 11:30:28 AM
1class Solution {
2    public String countAndSay(int n) {
3    String s="1";
4    for(int i=1;i<n;i++){
5        String t="";
6        int c=1;
7        for(int j=1;j<s.length();j++){
8            if(s.charAt(j)==s.charAt(j-1)){
9                c++;
10            }
11            else{
12                t=t+c+""+s.charAt(j-1);
13                c=1;
14            }
15        }
16                s = t + c + s.charAt(s.length() - 1); 
17                } 
18        
19                return s;
20            
21        }
22
23    }
24