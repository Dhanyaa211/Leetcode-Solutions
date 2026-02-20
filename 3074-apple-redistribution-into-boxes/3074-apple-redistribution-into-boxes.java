class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int count=0;
        Arrays.sort(capacity);
        int sum=0;
        for(int i=0;i<apple.length;i++){
            sum+=apple[i];
        }
        for(int i=capacity.length-1;i>=0;i--){
            sum-=capacity[i];
            count++;
            if(sum<=0) return count;
        }
        return 0;
    }
}