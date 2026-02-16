class Solution {
    public int arrangeCoins(int n) {
        int rem=n;
        for(int i=1;i<=n;i++){
            if(rem>=i){
                rem-=i;
            }
            
            else{
                return i-1;
            }
        }
        return n>1?0:1;
    }
}