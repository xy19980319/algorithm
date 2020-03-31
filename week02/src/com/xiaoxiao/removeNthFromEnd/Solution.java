package com.xiaoxiao.removeNthFromEnd;

/**
 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 示例：
 给定一个链表: 1->2->3->4->5, 和 n = 2.
 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 说明：
 给定的 n 保证是有效的。
 进阶：
 你能尝试使用一趟扫描实现吗？
 * @author Xiaoyu
 * @date 2020/3/18 - 9:10
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode lastNode = head;
        ListNode h = head;
        ListNode preHead = head;
        //找到后头结点的后n个结点
        for (int i = 0; i < n-1; i++) {
            lastNode =lastNode.next;
        }


        //两个指针同时开始扫描,当后一个扫描完,前一个停下
        while(lastNode.next != null) {
            preHead =h;
            h = h.next;
            lastNode = lastNode.next;

        }
        //找到了要删除的结点位置
        if(preHead==h) {
            head = head.next;
        }else{
            preHead.next = preHead.next.next;
        }
        return head;
    }
}
