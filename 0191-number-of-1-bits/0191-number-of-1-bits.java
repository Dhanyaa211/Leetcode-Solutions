class Solution {
    public int hammingWeight(int n) {
        int count=0;
        String s=Integer.toBinaryString(n);
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(a=='1') count++;
        }
        return count;
    }
}