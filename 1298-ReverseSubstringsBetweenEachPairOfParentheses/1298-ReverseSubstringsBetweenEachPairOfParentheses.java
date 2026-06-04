// Last updated: 6/4/2026, 1:17:11 PM
class Solution {
    public String reverseParentheses(String s) {
         Stack<StringBuilder> stack = new Stack<>();
        StringBuilder current = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                
                stack.push(current);
                current = new StringBuilder();
            } else if (c == ')') {
                
                current.reverse();
                if (!stack.isEmpty()) {
                    current = stack.pop().append(current);
                }
            } else {
               
                current.append(c);
            }
        }

        return current.toString();
    }
}