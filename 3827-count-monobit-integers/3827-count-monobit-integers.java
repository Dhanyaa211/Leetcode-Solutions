class Solution {
    public int countMonobit(int n) {
        int count=1;
        for(int i=1;i<=n;i++){
            if(monobit(i)) count++;
        }
        return count;
    }
    public boolean monobit(int a){
        String bit=Integer.toBinaryString(a);
        for(int i=0;i<bit.length()-1;i++){
            if(bit.charAt(i)!=bit.charAt(i+1)) return false;
        }
        return true;
    }
}