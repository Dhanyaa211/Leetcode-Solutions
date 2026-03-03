class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count=(right-left)+1;
        for(int i=left;i<=right;i++){
            int prime=Integer.bitCount(i);
            if (prime < 2) {
                count--;
                continue;
            }
            for(int j=2;j*j<=prime;j++){
                if(prime%j==0){
                    count--;
                    break;
                } 
            }
        }
        return count;
    }
}