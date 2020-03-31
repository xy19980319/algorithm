package com.xiaoxiao.链表的中间结点;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/3/23 - 0:33
 */
public class TestDemo {
    @Test
    public void test() {
        ListNode l1 = new ListNode(0);
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(2);
        l1.next.next.next = new ListNode(3);
        l1.next.next.next.next = new ListNode(4);
        Solution s =new Solution();
        ListNode listNode = s.middleNode(l1);
        System.out.println(listNode);
    }
}
