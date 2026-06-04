// Last updated: 6/4/2026, 1:18:27 PM
class Solution {
    public int mySqrt(int x) {

        long i = 1;

        while (i * i <= x) {
            i++;
        }

        return (int)(i - 1);
    }
}
    