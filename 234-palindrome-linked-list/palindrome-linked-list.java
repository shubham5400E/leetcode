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
    public boolean isPalindrome(ListNode head) {
        ListNode s=head,f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        ListNode fir=head;
        ListNode mid=rev(s);
        ListNode sec=mid;

        while(sec!=null){
            if(fir.val!=sec.val){
                rev(mid);
                return false;
            }
            fir=fir.next;
            sec=sec.next;
        }
        rev(mid);
        return true;

    }
    ListNode rev(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode newl=rev(head.next);
        ListNode f=head.next;
        f.next=head;
        head.next=null;
        return newl;
    }
}