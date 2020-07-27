package com.xiaoxiao.no203移除链表元素;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/4/29 - 9:07
 */
public class TestDemo {
    @Test
    public void test() {
        ListNode l1 = new ListNode(6);
        l1.next = new ListNode(6);
        l1.next.next = new ListNode(6);
        l1.next.next.next = new ListNode(6);
        l1.next.next.next.next = new ListNode(6);
        l1.next.next.next.next.next = new ListNode(6);
        l1.next.next.next.next.next.next = new ListNode(6);
        Solution s= new Solution();
        ListNode listNode = s.removeElements(l1, 6);
        System.out.println(listNode);
    }
}
