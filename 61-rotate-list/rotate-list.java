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
    ListNode reverse(ListNode h){
        ListNode temp=null;
        h=h;
        while(h!=null){
            ListNode t=h.next;
            h.next=temp;
            
            temp=h;
            h=t;
        }
        return temp;
    }
    public ListNode rotateRight(ListNode head, int k) {
        int len=1;
        if(head==null|| head.next==null){return head;}
        ListNode a=head;
        while(a.next!=null){
            len++;
            a=a.next;
        }
        k=k%len;
        if(k==0){return head;}
        head=reverse(head);

        ListNode temp=head,t=null;
        while(k>0){
            t=temp;
            temp=temp.next;
            k--;
        }       
        t.next=null;
        head=reverse(head);
        ListNode u=head;
        temp=reverse(temp);
        while(head.next!=null){
            head=head.next;
        } 
        head.next=temp;
        return u;
    }
}