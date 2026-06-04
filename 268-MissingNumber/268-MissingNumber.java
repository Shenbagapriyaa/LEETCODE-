// Last updated: 6/4/2026, 1:17:50 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total = n*(n+1) / 2;
        int sum = 0;
        for(int i =0;i < n;i++){
            sum+=nums[i];
        }
        return total - sum;
    }
}