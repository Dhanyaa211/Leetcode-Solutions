class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> ans=new HashSet<>();
        for(int i=0;i<candyType.length;i++){
            ans.add(candyType[i]);
        }
        if(ans.size()<candyType.length/2){
            return ans.size();
        }
        return candyType.length/2;
    }
}