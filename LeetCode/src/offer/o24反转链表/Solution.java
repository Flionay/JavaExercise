package offer.o24反转链表;

public class Solution {
    public ListNode reverseList(ListNode head){
        ListNode c = head;
        ListNode n = null;
        ListNode p = null;
        while(c!= null ){
            n = c.next;
            c.next = p;
            p = c;
            c = n;
        }
        return p;

    }

}
