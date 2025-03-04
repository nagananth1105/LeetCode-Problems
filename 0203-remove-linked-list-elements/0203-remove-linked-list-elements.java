class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode temp = head;
        ListNode prev = null;

        while (temp != null) {
            if (temp.val == val) {
                prev.next = temp.next; 
            } else {
                prev = temp; // Move prev only if we don't delete the node
            }
            temp = temp.next; // Always move temp forward
        }

        return head;
    }
}
