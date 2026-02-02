import java.util.Stack;

class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else { // c == ')'
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop(); // matched pair
                } 
                else {
                    stack.push(c); // unmatched ')'
                }
            }
        }

        return stack.size(); // unmatched '(' + ')'
    }
}
