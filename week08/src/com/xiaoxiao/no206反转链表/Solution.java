package com.xiaoxiao.no206反转链表;

/**
 * @author Xiaoyu
 * @date 2020/4/29 - 22:12
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode last = head;
        ListNode curr = last.next;
        while(last.next!=null){
            last.next = curr.next;
            curr.next = head;
            dummy.next = curr;

            curr=last.next;
            head = dummy.next;
        }
        return dummy.next;
    }
}
