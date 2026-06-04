// Last updated: 6/4/2026, 1:19:03 PM
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;
        String str=Integer.toString(x);
        String rev=new StringBuilder(str).reverse().toString();
        return str.equals(rev);
        
    }
}