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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){return head;}
        ListNode temp=head.next;
        ListNode h=head;
        h.next=null;
        ListNode t=null;
        while(temp!=null){
            t=temp.next;
            temp.next=h;
            h=temp;
            temp=t;
        }
        return h;
    }
}