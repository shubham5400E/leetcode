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
    public ListNode sortList(ListNode head) {
        if(head==null|| head.next==null){return head;}
        ListNode mid=mid(head);
        ListNode right=mid.next;
        mid.next=null;
        ListNode left=head;
        left=sortList(left);
        right=sortList(right);
        return merge(left,right);
    }
    ListNode merge(ListNode left ,ListNode right){
        ListNode dummy=new ListNode(-1,null);
        ListNode temp=dummy;
        while(left!=null && right!=null){
            if(left.val<=right.val){
                temp.next=left;
                left=left.next;
            }else{
                temp.next=right;
                right=right.next;
            }
            temp=temp.next;
        }
        if(left!=null){
            temp.next=left;
        }
        else{
            temp.next=right;
        }
        return dummy.next;
    }
    ListNode mid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        if(head==null || head.next==null){
            return head;
        }
         
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        return prev;

    }
}