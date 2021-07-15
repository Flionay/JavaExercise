package 链表;

/**
 * https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 */

public class _237_ {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

}
