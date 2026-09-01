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
    public ListNode sortList(ListNode head) {

        if(head == null || head.next == null) {
            return head;
        }

        ListNode midNode = findMid(head);

        ListNode head2 = midNode.next;
        midNode.next = null;

        head = sortList(head);
        head2 = sortList(head2);

        ListNode merge = new ListNode(0);
        ListNode dummy = merge;

        while(head != null && head2 != null) {
            if(head.val <= head2.val) {
                dummy.next = head;
                head = head.next;
            }
            else{
                dummy.next = head2;
                head2 = head2.next;
            }
            dummy = dummy.next;
        }

        if(head != null) {
            dummy.next = head;
        }
        else{
            dummy.next = head2;
        }

        return merge.next;
        
    }

    public ListNode findMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}