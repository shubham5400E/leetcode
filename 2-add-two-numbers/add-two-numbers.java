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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0,null);
        ListNode t1=l1,t2=l2,t3=dummy;
        int carry=0,sum=0;
        while(t1!=null || t2!=null){
            if(t1!=null&&t2!=null){
            int v1=t1.val;
            int v2=t2.val;
            sum=v1+v2;
            if(carry>0){
                sum=sum+carry;
            }
            t1=t1.next;
            t2=t2.next;

            }
            else{
                if(t1!=null){
                    sum=carry+t1.val;
                    t1=t1.next;
                }else{
                    sum=carry+t2.val;
                    t2=t2.next;
                }
            }
            
            int digit=sum%10;
            carry=sum/10;

            
            ListNode a=new ListNode(digit,null);
            t3.next=a;
            t3=t3.next;
            
        }
        if (carry>0){
            ListNode a=new ListNode(carry,null);
            t3.next=a;
        }
        return dummy.next;
    }
}