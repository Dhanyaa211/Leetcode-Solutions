class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int cells=n*n;
        int count=0;
        for(int i=1;i<=cells;i++){
            int weight=i*w;
            if(weight<=maxWeight) count++;
            else break;
        }
        return count;
    }
}