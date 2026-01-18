class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] res=new int[nums1.length+nums2.length];
        int i=0;
        int j=0;
        int pos=0;
        while(i<nums1.length &&j<nums2.length){
            if(nums1[i]<nums2[j]){
                res[pos]=nums1[i];
                pos++;
                i++;
            }
            else{
                res[pos]=nums2[j];
                pos++;
                j++;
            }
        }
        while (i < nums1.length) {
            res[pos++] = nums1[i++];
        }

        while (j < nums2.length) {
            res[pos++] = nums2[j++];
        }
        int r=res.length;
        double median=0;
        if(r%2==0){
            median=(res[r/2]+res[(r/2)-1])/2.0;
        }
        else{
            median=res[r/2];
        }
        return median;
    }
}