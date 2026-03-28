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
    public ListNode middleNode(ListNode head) {
        
        int count=0;
        ListNode temp=head;
        ListNode mid=head;
        if(head==null){return head;}
        while(temp!=null){
            count++;
            if(count%2==0){
                mid=mid.next;
            }
            temp=temp.next;
        }
        return mid;
    }
}