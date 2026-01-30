class Solution {
    public String largestEven(String s) {
        int l=s.length()-1;
        while(l>=0){
            int c=s.charAt(l)-'0';
            if(c%2==0) return s.substring(0,l+1);
            l--;
        }
    return "";
}
}