package 链表.l141环形链表;

import 链表.l237删除链表元素._237_;

/**
 * https://leetcode-cn.com/problems/linked-list-cycle/
 * 快慢指针
 *
 */


public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head==null || head.next == null) return false;

        return true;
    }
}

class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val = val;
    }
}