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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode f=head,s=head.next,ft=head,st=head.next;
        ListNode temp=head.next.next;
        int a=0;
        while(temp!=null){
            if(a==0){
                ft.next=temp;
                ft=temp;
                a=1;
            }else{
                a=0;
                st.next=temp;
                st=temp;
            }
            temp=temp.next;
        }
        st.next=null;
        ft.next=s;
        return head;

    }
}