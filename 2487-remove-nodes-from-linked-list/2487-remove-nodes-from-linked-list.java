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
        ListNode current=reverse(head);
        ListNode temp=current;
        int max=current.val;
        while(temp.next!=null){
        if(temp.next.val>=max){
            temp=temp.next;
            max=temp.val;
        }
        else{
            temp.next=temp.next.next;
        }
     }
      return reverse(current);
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