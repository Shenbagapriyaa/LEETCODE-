// Last updated: 6/4/2026, 1:17:43 PM
class Solution {
    public String reverseVowels(String s) {
        String v="";
        char arr[]=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(isVowel(arr[i])){
                v+=arr[i];
            }
        }
        int j=v.length()-1;
        for(int i=0;i<arr.length;i++){
            if(isVowel(arr[i])){
                arr[i]=v.charAt(j);
                j--;
            }
        }
        return new String(arr);
    }

        public boolean isVowel(char ch){
           return ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
        
    }
}