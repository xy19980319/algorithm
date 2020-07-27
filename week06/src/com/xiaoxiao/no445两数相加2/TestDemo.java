package com.xiaoxiao.no445两数相加2;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/4/14 - 22:54
 */
public class TestDemo {
    @Test
    public void test() {
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);
        l1.next.next.next = new ListNode(9);
       // l1.next.next.next.next = new ListNode(1);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(1);
        l2.next.next = new ListNode(1);
        l2.next.next.next = new ListNode(1);
        //l2.next.next.next.next = new ListNode(9);
        Solution s= new Solution();
        ListNode listNode = s.addTwoNumbers(l1, l2);
        System.out.println(listNode);
    }
}
