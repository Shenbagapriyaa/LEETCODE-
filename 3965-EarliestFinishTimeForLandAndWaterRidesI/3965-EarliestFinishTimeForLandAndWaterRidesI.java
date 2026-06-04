// Last updated: 6/4/2026, 1:16:44 PM
class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
    int min=Integer.MAX_VALUE;
    for(int i=0;i<landStartTime.length;i++){
        for(int j=0;j<waterStartTime.length;j++){
            int a=Math.max(landStartTime[i]+landDuration[i],
            waterStartTime[j])+waterDuration[j];
            int b=Math.max(waterStartTime[j]+waterDuration[j],
            landStartTime[i])+landDuration[i];
        min=Math.min(min,Math.min(a,b));
        }

    }
    return min;
    }
}