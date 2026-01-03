class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[]{-1, -1}; // Default result if target is not found

        // Find the leftmost index of the target
        int left = binarySearch(nums, target, true);
        if (left == -1) {
            return ans; // Target not found
        }

        // Find the rightmost index of the target
        int right = binarySearch(nums, target, false);

        // Update the result
        ans[0] = left;
        ans[1] = right;
        return ans;
    }

    private int binarySearch(int[] nums, int target, boolean findFirst) {
        int low = 0, high = nums.length - 1, result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                result = mid; // Potential answer
                if (findFirst) {
                    high = mid - 1; // Narrow down to find the first occurrence
                } else {
                    low = mid + 1; // Narrow down to find the last occurrence
                }
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
}
