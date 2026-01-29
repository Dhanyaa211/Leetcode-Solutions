class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int prod=1;
        int temp=n;
        while(temp>0){
            int d=temp%10;
            sum+=d;
            prod*=d;
            temp/=10;
        }
        int total=sum+prod;
        return (n%total==0? true:false);
    }
}