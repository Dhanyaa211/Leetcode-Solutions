class Solution {
    public String reverseVowels(String s) {
        StringBuilder res=new StringBuilder();
        List<Character> ch=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u' || a=='A' || a=='E' || a=='I' || a=='O' || a=='U' ){
                ch.add(a);
            }
        }
        int pos=ch.size()-1;
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u' || a=='A' || a=='E' || a=='I' || a=='O' || a=='U' ){
                res.append(ch.get(pos--));
            }
            else{
                res.append(a);
            }
        }
        return res.toString();
    }
}