package com.xiaoxiao.no203移除链表元素;

/**
 * @author Xiaoyu
 * @date 2020/4/29 - 20:28
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        while (head != null) {
            if (head.val == val) {
                pre.next = pre.next.next;
                head.next = null;
                head = pre.next;
                continue;
            }
            head = head.next;
            pre = pre.next;
        }
        return dummy.next;
    }
}
