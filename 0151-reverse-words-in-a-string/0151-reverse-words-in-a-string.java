class Solution {
    public String reverseWords(String s) {
        StringBuilder ans=new StringBuilder();
        String[] si=s.trim().split("\\s+");
        for(int i=si.length-1;i>0;i--){
            ans.append(si[i]+" ");
        }
        ans.append(si[0]);
        return ans.toString();
    }
}