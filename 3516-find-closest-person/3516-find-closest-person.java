class Solution {
    public int findClosest(int x, int y, int z) {
        int min=0;
        int minPos=0;
        min=Math.min(Math.abs(x-z),Math.abs(y-z));
        if(Math.abs(x-z)==Math.abs(y-z)) return 0;
        if(Math.abs(x-z)==min) return 1;
        else return 2;
    }
}