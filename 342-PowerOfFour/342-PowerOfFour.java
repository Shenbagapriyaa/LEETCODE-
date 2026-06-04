// Last updated: 6/4/2026, 1:17:47 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0)
        return false;
        if(n==1)
        return true;
        if(n%4!=0)
        return false;
         return isPowerOfFour(n/4);
    }
}