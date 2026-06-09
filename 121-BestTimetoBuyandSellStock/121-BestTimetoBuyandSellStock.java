// Last updated: 6/9/2026, 2:25:37 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3      int min=prices[0];
4      int max=0;
5      for(int i=1;i<prices.length;i++){
6        if(prices[i]<min){
7            min=prices[i];
8        }
9        int profit=prices[i]-min;
10        if(profit>max){
11        max=profit;
12      }  
13
14    }
15    return max;
16}
17}