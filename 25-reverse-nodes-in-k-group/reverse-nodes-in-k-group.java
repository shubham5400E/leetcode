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
    public ListNode reverseKGroup(ListNode head, int k) {
    ListNode dummy=new ListNode(0);
    dummy.next=head;
    ListNode h=dummy;
    while(true){
        ListNode t=find(h,k);
        if(t==null){break;}
        ListNode prev=t.next;
        ListNode curr=h.next;
        for(int i=0;i<k;i++){
            ListNode a=curr.next;
            curr.next=prev;
            prev=curr;
            curr=a;
        }
        ListNode b=h.next;
        h.next=t;
        h=b;


    }    
    return dummy.next;
    }
    ListNode find(ListNode h,int k){
        while (k>0&&h!=null){
            h=h.next;
            k--;
        }
        return h;
    }
}
