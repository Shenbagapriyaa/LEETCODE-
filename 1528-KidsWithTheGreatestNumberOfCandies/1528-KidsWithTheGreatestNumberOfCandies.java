// Last updated: 6/4/2026, 1:17:04 PM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
      List<Boolean> ans=new ArrayList<>();
      int max=candies[0];
      for(int i=0;i<candies.length;i++){
        if(candies[i]>max)
        max=candies[i];
      }
      for(int i=0;i<candies.length;i++){
        if(candies[i]+extraCandies >=max){
        ans.add(true);
        }
        else{
            ans.add(false);
        }
      }
      return ans;

    }
}