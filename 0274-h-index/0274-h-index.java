class Solution {
    public int hIndex(int[] citations) {
        int count=0;
        Arrays.sort(citations);
        for(int i=0;i<citations.length;i++){
            int h=citations.length-i;
            if(citations[i]>=h){
                count++;
            }
        }
        return count;
    }
}