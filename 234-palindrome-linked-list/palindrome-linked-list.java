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

        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head;

        while(temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }

        return palindrome(arr);
        
    }

    public boolean palindrome(ArrayList<Integer> arr) {
        int left = 0, right = arr.size()-1;

        while(left < right) {
            if(arr.get(left) != arr.get(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}