// Last updated: 6/4/2026, 1:17:18 PM
class Solution {
    public int minAddToMakeValid(String s) {
       int x=0;
       int y=0;
       for(char c:s.toCharArray()) {
       if(c=='('){
       x++;
    }
    else{
        if(x>0){
            x--;
        }
        else{
            y++;
        }
    }
 }
return x+y;
        }
    }
    
    