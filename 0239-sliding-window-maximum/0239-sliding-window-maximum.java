class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // int max=Integer.MIN_VALUE;
        Deque<Integer> dq=new ArrayDeque<>();
        int pos=0;
        int[] res=new int[nums.length-k+1];
        for(int i=0;i<nums.length;i++){
            if(!dq.isEmpty() && dq.peekFirst()==i-k){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
            if(i>=k-1){
                res[pos++]=nums[dq.peekFirst()];
            }
        }
        // for(int i=0;i<=nums.length-k;i++){
        //     max=Integer.MIN_VALUE;
        //     for(int j=i;j<i+k;j++){
        //         if(nums[j]>max){
        //             max=nums[j];
        //         }
        //     }
        //     res[pos]=max;
        //         pos++;
                
        // }
        return res;
    }
}