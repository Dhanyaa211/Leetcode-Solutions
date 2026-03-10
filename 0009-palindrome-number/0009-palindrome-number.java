class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int rem;
        int d=0;
        while(temp>0){
            rem=temp%10;
            // if (d > Integer.MAX_VALUE / 10 || d < Integer.MIN_VALUE / 10) {
            //     return 0;
            // }
            d=rem+d*10;
            temp=temp/10;
    }
    return d==x;
}
}