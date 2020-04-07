package com.xiaoxiao.no92翻转链表2;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/4/2 - 10:24
 */
public class TestDemo {
    @Test
    public void test() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);
        //l1.next.next.next.next.next = new ListNode(2);
      //  l1.next.next.next.next.next.next = new ListNode(3);
      //  l1.next.next.next.next.next.next.next = new ListNode(1);
        Solution s = new Solution();
        ListNode listNode = s.reverseBetween(l1, 2, 4);
        System.out.println(listNode);
    }
}
