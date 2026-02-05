class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        // find max pile
        for (int p : piles) {
            high = Math.max(high, p);
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long hours = 0;

            // calculate total hours needed at speed = mid
            for (int p : piles) {
                hours += (p + mid - 1) / mid; // ceil(p / mid)
            }

            if (hours <= h) {
                // speed is sufficient, try slower
                high = mid - 1;
            } else {
                // too slow, increase speed
                low = mid + 1;
            }
        }

        return low; // minimum valid speed
    }
}
