package com.xiaoxiao.no82删除重复结点;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/4/2 - 10:24
 */
public class TestDemo {
    @Test
    public void test() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(1);
        l1.next.next.next = new ListNode(1);
        l1.next.next.next.next = new ListNode(1);
       // l1.next.next.next.next.next = new ListNode(5);
        //l1.next.next.next.next.next.next = new ListNode(5);
       // l1.next.next.next.next.next.next.next = new ListNode(5);
        Solution s = new Solution();
        /*ListNode listNode = s.deleteDuplicates(l1);
        System.err.println(listNode);*/
        ListNode listNode = s.deleteDuplicates1(l1);
        System.err.println(listNode);
    }
}
