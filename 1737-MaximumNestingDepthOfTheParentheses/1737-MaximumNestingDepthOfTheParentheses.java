// Last updated: 6/4/2026, 1:17:03 PM
class Solution {
    public int maxDepth(String s) {
      int currentDepth = 0;
        int maxDepth = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                currentDepth++;
                maxDepth = Math.max(maxDepth, currentDepth);
            } else if(c == ')') {
                currentDepth--;
            }
        }
        return maxDepth;  
    }
}