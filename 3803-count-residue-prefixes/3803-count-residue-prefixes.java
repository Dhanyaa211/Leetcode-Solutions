class Solution {
    public int residuePrefixes(String s) {
        boolean[] seen=new boolean[26];
        int dis=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            int ind=s.charAt(i)-'a';
            if(!seen[ind]) {
                seen[ind]=true;
                dis++;
        }
        int len=i+1;
        if(dis==(len%3)) count++;
    }
    return count;
}
}