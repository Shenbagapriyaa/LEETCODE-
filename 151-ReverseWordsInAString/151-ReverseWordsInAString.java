// Last updated: 6/4/2026, 1:18:12 PM
class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split(" ");
        String ans=" ";
        for(int i=arr.length-1;i>=0;i--){
            if(!arr[i].equals(""))
            ans+=arr[i]+" ";
        }

        return ans.trim();
    }
}