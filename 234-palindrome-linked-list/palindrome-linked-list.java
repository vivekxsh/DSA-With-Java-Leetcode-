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
    public boolean isPalindrome(ListNode head) {
        
        ListNode temp = head;
        StringBuilder sb = new StringBuilder();

        while(temp!=null) {
            sb.append(temp.val);
            temp = temp.next;
        }

        // int number = Integer.parseInt(sb.toString());

        return isPalindrome(sb.toString());

    }

    public static boolean isPalindrome(String number) {

        int left = 0;
        int right = number.length()-1;

        while(left < right) {
            if(number.charAt(left) != number.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
        
    }
}