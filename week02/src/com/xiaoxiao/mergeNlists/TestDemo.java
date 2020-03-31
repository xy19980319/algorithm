package com.xiaoxiao.mergeNlists;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/3/19 - 23:24
 */
public class TestDemo {
    @Test
    public void test() {
        ListNode l1 = null;
        ListNode l2 = null;
        l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        l1.next.next.next = new ListNode(5);

        l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        Solution s = new Solution();
        ListNode listNode = s.mergeKLists(l1, l2);
        System.out.println(listNode);
    }
}
