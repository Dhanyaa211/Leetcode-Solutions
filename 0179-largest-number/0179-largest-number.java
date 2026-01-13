class Solution {
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        
        for(int i = 0; i < nums.length; i++) {
            arr[i] =Integer.toString(nums[i]);
        }

        // Sort by last digit descending
        Arrays.sort(arr, (a, b) -> (b +a).compareTo(a +b));
        if(arr[0].equals("0")) return "0";
        StringBuilder str = new StringBuilder();
        for(String num : arr) {
            str.append(num);
        }

        return str.toString();
    }
}
