package com.xiaoxiao.no147对链表进行插入排序;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/4/28 - 0:22
 */
public class TestDemo {
    @Test
    public void test() {
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(8);
        l1.next.next = new ListNode(7);
        l1.next.next.next = new ListNode(6);
       // l1.next.next.next.next = new ListNode(0);
        Solution s = new Solution();
        ListNode listNode = s.insertionSortList(l1);
        System.out.println(listNode);
    }
}
