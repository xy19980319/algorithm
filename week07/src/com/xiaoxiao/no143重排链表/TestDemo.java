package com.xiaoxiao.no143重排链表;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/4/20 - 23:09
 */
public class TestDemo {
    @Test
    public void test() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);
        l1.next.next.next.next.next = new ListNode(6);
        l1.next.next.next.next.next.next= new ListNode(7);
        Solution s = new Solution();
        s.reorderList(l1);
        System.out.println(l1);
    }
}
