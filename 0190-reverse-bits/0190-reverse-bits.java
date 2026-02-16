class Solution {
    public int reverseBits(int n) {
         String bit = String.format("%32s", Integer.toBinaryString(n))
                          .replace(' ', '0');
        String reversed = new StringBuilder(bit).reverse().toString();
        return (int) Long.parseLong(reversed, 2);
    }
}