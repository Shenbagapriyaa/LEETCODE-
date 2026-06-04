// Last updated: 6/4/2026, 1:16:49 PM
class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int tot=0;
        int c=0;
        for(int i=cost.length-1;i>=0;i--){
            c++;
        
        if(c==3){
            c=0;
            continue;
        }
        tot+=cost[i];
        }
        return tot;
    }
}