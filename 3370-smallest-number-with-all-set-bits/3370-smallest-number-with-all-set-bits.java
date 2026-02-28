class Solution {
    public int smallestNumber(int n) {
        int temp = n;

        while (true) {
            // check if temp has all bits set
            if ((temp & (temp + 1)) == 0) {
                return temp;
            }
            temp++;
        }
    }
}