class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int temp=x;
        int rev=0;
        int d=0;
        while(temp>0){
            d=temp%10;
            rev=rev*10+d;
            temp/=10;
        }
        return rev==x;
    }
}