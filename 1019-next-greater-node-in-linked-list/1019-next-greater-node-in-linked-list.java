/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> list= new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        int n=list.size();
        int[] ans=new int[n];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && list.get(i)>list.get(s.peek())){
                ans[s.pop()]=list.get(i);
            }
            s.push(i);
        }
        return ans;
    }
}