// Last updated: 6/4/2026, 1:18:46 PM
class Solution {
    public int strStr(String haystack, String needle) {
       int n=needle.length();
       int h=haystack.length();
       for(int i=0;i<=h-n;i++)
       {
        if(haystack.substring(i,i+n).equals(needle))
        {
            return i;
        }
       }
        return -1;
       }
    }