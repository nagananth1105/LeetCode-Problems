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
     public ListNode removeNodes(ListNode head) {
         head=reverse(head);
        ListNode temp=head;
        int max=head.val;
        while(head.next!=null){
        if(head.next.val>=max){
            head=head.next;
            max=head.val;
        }
        else{
            head.next=head.next.next;
        }
     }
      return reverse(temp);
     }
    public ListNode reverse(ListNode head) {
        ListNode prev=null;
        ListNode current = head;
        ListNode next=head.next;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
        return head;
        }
    }