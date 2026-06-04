// Last updated: 6/4/2026, 1:16:47 PM
class Solution {
    public int averageValue(int[] nums) {
        int count=0;
        int sum=0;
        for(int i:nums){
            if(i%2==0 && i%3==0){
                sum+=i;
                count++;
            }
        }
        return count==0?0:sum/count;
        
    }
}
    
    