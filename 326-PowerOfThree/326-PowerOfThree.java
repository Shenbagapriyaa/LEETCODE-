// Last updated: 6/4/2026, 1:17:48 PM
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0)
        return false;
        if(n==1)
        return true;
        if(n%3!=0)
        return false;
        return isPowerOfThree(n/3);
    }
}