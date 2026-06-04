// Last updated: 6/4/2026, 1:18:40 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
   // int left=0;
    //int right=nums.length-1;
   for (int i= 0; i<nums.length ;i++){
    if(nums[i] >=target){
        return i;
    }
   }
   
    return  nums.length;
   
    }
}
   
       