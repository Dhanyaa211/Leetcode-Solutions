class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list=new ArrayList<>();
        int a=0;
        int b=0;
        while(a<nums1.length && b<nums2.length){
            if(nums1[a]==nums2[b]) {
                    list.add(nums1[a]);
                    a++;
                    b++;
            }
        else if(nums1[a]>nums2[b]){
            b++;
        }
        else if(nums1[a]<nums2[b]){
            a++;
        }
        }
        int[] ans=new int[list.size()];
        int i=0;
        for(int m:list){
            ans[i++]=m;
        }
        return ans;
    }
}