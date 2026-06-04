// Last updated: 6/4/2026, 1:16:54 PM
class Solution {
    public int arraySign(int[] nums) {
        int sign = 1;
        for(int n :nums){
            if(n == 0){
            return 0;
            }
            if (n < 0){
               sign = -sign; 
            }
        }
        return sign;
    }
}