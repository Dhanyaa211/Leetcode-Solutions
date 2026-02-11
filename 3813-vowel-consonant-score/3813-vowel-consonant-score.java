class Solution {
    public int vowelConsonantScore(String s) {
        int vc=0;
        int cc=0;
        for(int i=0;i<s.length();i++){
            char j = Character.toLowerCase(s.charAt(i));

            if (j == 'a' || j == 'e' || j == 'i' || j == 'o' || j == 'u') {
                vc++;
            } else if (Character.isLetter(j)) {
                cc++;
            }
        }
        return cc>0?vc/cc:0;
    }
}