// Last updated: 6/4/2026, 1:17:14 PM
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String temp1=str1+str2;
        String temp2=str2+str1;
        boolean same=true;
        for(int i=0;i<temp1.length();i++ ){
            if(temp1.charAt(i)!=temp2.charAt(i)){
                same=false;
                break;
            }
        }
        if(!same){
            return "";
        }
        
        int len1=str1.length();
        int len2=str2.length();
        int gcd=1;
        for(int i=1;i<=len1 && i<=len2;i++){
            if(len1% i == 0 && len2 % i == 0){
            gcd=i;
            }
        }
        String res="";
        for(int i=0;i<gcd;i++){
            res+=str1.charAt(i);
        }

        return res;
    }
}