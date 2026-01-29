class Solution {
    public int minimumFlips(int n) {
        String bin=Integer.toBinaryString(n);
        int l=bin.length()-1;
        int i=0;
        int count =0;
        while(i<l){
                if(bin.charAt(i)!=bin.charAt(l)){
                    count+=2;
                }
                i++;
                l--;
            }
        return count;
    }
}