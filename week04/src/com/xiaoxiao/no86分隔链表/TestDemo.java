package com.xiaoxiao.no86分隔链表;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/4/2 - 10:24
 */
public class TestDemo {
    @Test
    public void test() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(2);
        l1.next.next.next.next = new ListNode(5);
        l1.next.next.next.next.next = new ListNode(2);
      //  l1.next.next.next.next.next.next = new ListNode(3);
      //  l1.next.next.next.next.next.next.next = new ListNode(1);
        Solution s = new Solution();
        s.partition(l1, 3);
    }
}
