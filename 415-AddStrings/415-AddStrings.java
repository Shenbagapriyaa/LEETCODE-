// Last updated: 6/7/2026, 8:51:43 PM
1class Solution {
2    public String addStrings(String num1, String num2) {
3        String ans="";
4        int i=num1.length()-1;
5        int j=num2.length()-1;
6        int carry=0;
7        while(i>=0||j>=0||carry>0) {
8            int sum=carry;
9            if(i>=0){
10                sum+=num1.charAt(i)-'0';
11                i--;
12            }
13            if(j>=0){
14                sum+=num2.charAt(j)-'0';
15                j--;
16            }
17            ans=(sum%10)+ans;
18            carry=sum/10;
19        }
20    
21        return ans;
22    }
23}