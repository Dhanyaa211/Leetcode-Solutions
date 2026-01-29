class Solution {
    public int[] decimalRepresentation(int n) {
        int temp = n, count = 0;

        // count non-zero digits
        while (temp > 0) {
            if (temp % 10 != 0) count++;
            temp /= 10;
        }

        int[] arr = new int[count];
        int mul = 1;
        int l = arr.length - 1;

        while (n > 0) {
            int d = n % 10;
            if (d != 0) {
                arr[l] = d * mul;
                l--;
            }
            mul *= 10;
            n /= 10;
        }
        return arr;
    }
}
