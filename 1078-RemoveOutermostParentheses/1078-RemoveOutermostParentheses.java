// Last updated: 6/4/2026, 1:17:16 PM
class Solution {
    public String removeOuterParentheses(String s) {
       StringBuilder result = new StringBuilder();
        int bal = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                if (bal > 0) {
                    result.append(c); 
                }
                bal++;
            } else if (c == ')') {
                if (bal> 1) {
                    result.append(c); 
                }
                bal--;
            }
        }
        return result.toString();  
    }
}