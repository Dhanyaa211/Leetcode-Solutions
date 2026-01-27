class Solution {
    public int mirrorDistance(int n) {
        int temp=n;
        int rem=0;
        while(temp>0){
            int d=temp%10;
            rem=rem*10+d;
            temp/=10;
        }
        return Math.abs(rem-n);
    }
}