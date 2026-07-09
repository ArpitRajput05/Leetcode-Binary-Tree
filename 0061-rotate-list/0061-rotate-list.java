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

    public ListNode rotateRight(ListNode head, int k) {

        if (head == null)
            return null;

        ArrayList<Integer> arr = new ArrayList<>();

        ListNode temp = head;

        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }

        int n = arr.size();

        k = k % n;

        int start = n - k;

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        for (int i = 0; i < n; i++) {

            curr.next = new ListNode(arr.get((start + i) % n));
            curr = curr.next;
        }

        return dummy.next;
    }
}