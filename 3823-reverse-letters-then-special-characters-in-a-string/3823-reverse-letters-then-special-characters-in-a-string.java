class Solution {
    public String reverseByType(String s) {

        StringBuilder let = new StringBuilder();
        StringBuilder spl = new StringBuilder();
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                let.append(ch);
            } else if (!Character.isDigit(ch)) {
                spl.append(ch);
            }
        }
        let.reverse();
        spl.reverse();
        int pos = 0, posi = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                str.append(let.charAt(pos++));
            } else if (!Character.isDigit(ch)) {
                str.append(spl.charAt(posi++));
            } else {
                str.append(ch); 
            }
        }

        return str.toString();
    }
}
