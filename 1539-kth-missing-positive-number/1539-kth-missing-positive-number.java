class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i = 0;
        int num = 1;
        int count = 0;

        while (true) {
            if (i < arr.length && arr[i] == num) {
                i++;        
            } else {
                count++;
                if (count == k) {
                    return num;
                }
            }
            num++;
        }
    }
}