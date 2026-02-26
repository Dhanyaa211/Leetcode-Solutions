class Solution {
    public int findComplement(int num) {
        String numb=Integer.toBinaryString(num);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<numb.length();i++){
            if(numb.charAt(i)=='0') sb.append("1");
            else sb.append("0");
        }
        int ans = Integer.parseInt(sb.toString(), 2);
        return ans;
    }
}