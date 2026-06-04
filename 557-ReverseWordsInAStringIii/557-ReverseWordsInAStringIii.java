// Last updated: 6/4/2026, 1:17:31 PM
class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split(" ");
        String rev="";
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("")){
                continue;
            }
            for(int j=arr[i].length()-1;j>=0;j--){
               rev+= arr[i].charAt(j);
            }
            rev+=" ";
        }
        return rev.trim();
        
    }
}