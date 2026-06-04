// Last updated: 6/4/2026, 1:17:34 PM
public class Solution {
    public int countSegments(String s) {
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }
        String[] segments = s.split(" +"); 
        return segments.length; 
    }
}  