// Last updated: 6/4/2026, 1:16:45 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;
        for (int i : nums) {
            elementSum += i;
            while (i > 0) {
                digitSum += i % 10;
                i /= 10;
            }
        }
        return Math.abs(elementSum - digitSum);
    }
}