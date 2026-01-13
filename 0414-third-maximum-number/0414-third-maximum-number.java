class Solution {
    public int thirdMax(int[] nums) {
        Long largest = null;
        Long secLargest = null;
        Long thirdLargest = null;

        for (int i = 0; i < nums.length; i++) {
            long num = nums[i];

            if ((largest != null && num == largest) ||
                (secLargest != null && num == secLargest) ||
                (thirdLargest != null && num == thirdLargest)) {
                continue;
            }

            if (largest == null || num > largest) {
                thirdLargest = secLargest;
                secLargest = largest;
                largest = num;
            } 
            else if (secLargest == null || num > secLargest) {
                thirdLargest = secLargest;
                secLargest = num;
            } 
            else if (thirdLargest == null || num > thirdLargest) {
                thirdLargest = num;
            }
        }

        return (thirdLargest == null) ? largest.intValue() : thirdLargest.intValue();
    }
}
