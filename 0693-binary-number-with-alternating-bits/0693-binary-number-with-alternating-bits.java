class Solution {
    public boolean hasAlternatingBits(int n) {
        String bit=Integer.toBinaryString(n);
        for(int i=0;i<bit.length()-1;i++){
            char c= bit.charAt(i);
            if(c==bit.charAt(i+1)) return false;
        }
        return true;
    }
}