class Solution {
    public String reverseOnlyLetters(String s) {
        int i=0;
        int j=s.length()-1;
        char[] c=s.toCharArray();
        while (i < j) {
            if (Character.isLetter(c[i]) && Character.isLetter(c[j])) {
                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;
                i++;
                j--;
            } 
            else if (!Character.isLetter(c[i])) {
                i++;
            } 
            else {
                j--;
            }
        }
        return new String(c);
    }
}