// Last updated: 6/4/2026, 1:17:45 PM
   public class Solution {
    public void reverseString(char[] s) {
        String str = new String(s);
        String reversedStr = new StringBuilder(str).reverse().toString();
        for (int i = 0; i < s.length; i++) {
            s[i] = reversedStr.charAt(i);
        }
    }
}
    
