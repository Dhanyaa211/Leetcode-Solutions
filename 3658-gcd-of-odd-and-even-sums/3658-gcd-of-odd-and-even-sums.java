class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddsum=0;
        int evensum=0;
        for(int i=1;i<2*n;i+=2) oddsum+=i;
        for(int i=2;i<2*n;i+=2) evensum+=i;
        return gcd(oddsum,evensum);
    }
    public int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}