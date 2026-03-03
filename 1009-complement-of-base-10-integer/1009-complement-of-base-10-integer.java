class Solution {
    public int bitwiseComplement(int n) {
        String bin = Integer.toBinaryString(n);
        StringBuilder flipped = new StringBuilder();

        for (char c : bin.toCharArray()) {
            flipped.append(c == '0' ? '1' : '0');
        }

        return Integer.parseInt(flipped.toString(), 2);
    }
}