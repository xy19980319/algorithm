package com.xiaoxiao.reverseKGroup;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/3/20 - 20:47
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
        ListNode listNode = s.reverseKGroup(l1, 3);
        System.out.println(listNode);
    }
}
