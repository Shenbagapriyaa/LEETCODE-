// Last updated: 6/4/2026, 1:17:09 PM
class Solution {
    public int minCostToMoveChips(int[] position) {
        int oc = 0;
        int ec = 0;
        for(int i = 0; i < position.length; i++){
    int pos = position[i];
    if(pos % 2 == 0){
        ec++;
    } else {
        oc++;
    }
}

        return Math.min(oc,ec);
    }
}
        
    