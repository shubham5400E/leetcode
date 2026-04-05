/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
        head=makeCopy(head);
        head=addRandom(head);

        return seperate(head);
    }
    Node seperate(Node head){
        Node temp=head;
        Node dummy =new Node(-1);
        dummy.next=null;
        Node t=dummy;
        while(temp!=null){
            dummy.next=temp.next;
            dummy=dummy.next;
            temp.next=temp.next.next;
            temp=temp.next;
        }
        return t.next;
    }
    Node addRandom(Node head){
        Node temp=head;
        while(temp!=null){
            if(temp.random!=null){
            temp.next.random=temp.random.next;}
            else{
                temp.next.random=null;
            }
            temp=temp.next.next;
        }
        return head;
    }
    Node makeCopy(Node head){
        Node temp=head;
        while(temp!=null){
            Node t=temp.next;
            Node n=new Node(temp.val);
            temp.next=n;
            n.next=t;
            temp=t;
        }
        return head;
    }
}