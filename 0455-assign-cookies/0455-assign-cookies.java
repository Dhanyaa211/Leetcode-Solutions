class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int a=0;
        int b=0;
        while(a<g.length && b<s.length){
            if(g[a]<=s[b]){
                count++;
                a++;
                b++;
            }
            else if(g[a]>s[b]){
                b++;
            }
            else if(g[a]<s[b]){
                a++;
            }
        }
        return count;
    }
}