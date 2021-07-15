package offer.o24反转链表;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        // 创建了三个Node
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(2);
        ListNode list3 = new ListNode(3);

        // 将他们串起来
        list1.next = list2; // 就相当于在类里面的 ListNode next = new  ListNode(2);
        list2.next = list3;

        // 输出一下
        System.out.println(list1.next.next.val); //2

    }
}

class ListNode{
    int val;
    ListNode next; // 声明next变量为ListNode 用的时候再给它赋值
    public ListNode(int val){
        this.val = val;
    }
}