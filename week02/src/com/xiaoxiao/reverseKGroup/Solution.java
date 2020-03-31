package com.xiaoxiao.reverseKGroup;

/**给你一个链表，每 k 个节点一组进行翻转，请你返回翻转后的链表。
 k 是一个正整数，它的值小于或等于链表的长度。
 如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。
 示例：
 给你这个链表：1->2->3->4->5
 当 k = 2 时，应当返回: 2->1->4->3->5
 当 k = 3 时，应当返回: 3->2->1->4->5
 说明：

 你的算法只能使用常数的额外空间。
 你不能只是单纯的改变节点内部的值，而是需要实际进行节点交换。
 * @author Xiaoyu
 * @date 2020/3/20 - 20:47
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null||k==1) {
            return head;
        }
        //创建一个头结点
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        ListNode curr = preHead;
        //ListNode prelast = preHead;
        ListNode last = preHead;
        while(head.next != null) {
            //找到prelast的位置和last的位置
            for (int i = 0; i < k; i++) {
                last = last.next;
                if (last == null) {
                    break;
                }
            }
            if (last == null) break;
            head = curr.next;
            while (curr.next != last) {
                ListNode cur = curr.next;
                curr.next = cur.next;
                cur.next = last.next;
                last.next = cur;
            }
            curr = head;
            last = head;

        }
        return preHead.next;
    }

}
