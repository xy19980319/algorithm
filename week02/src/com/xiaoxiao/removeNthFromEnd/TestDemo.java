package com.xiaoxiao.removeNthFromEnd;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/3/18 - 9:40
 */
public class TestDemo {
    @Test
    public void test() {
        Solution s = new Solution();
        ListNode head = new ListNode(1);
        /*head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);*/
        ListNode listNode = s.removeNthFromEnd(head, 1);
        System.out.println(listNode);
    }
}
