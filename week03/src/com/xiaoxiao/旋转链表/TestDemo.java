package com.xiaoxiao.旋转链表;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/3/26 - 23:31
 */
public class TestDemo {
    @Test
    public void test() {
        ListNode l1 = null;
        l1 = new ListNode(1);
        l1.next = new ListNode(2);
       // l1.next.next = new ListNode(3);
        //l1.next.next.next = new ListNode(4);
       // l1.next.next.next.next = new ListNode(5);
        Solution s = new Solution();
        ListNode listNode = s.rotateRight(l1, 5);
        System.out.println(listNode);
    }
}
