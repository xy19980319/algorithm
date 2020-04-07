package com.xiaoxiao.no92翻转链表2;

/**
 * 反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。
 * 说明:
 * 1 ≤ m ≤ n ≤ 链表长度。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->3->4->5->NULL, m = 2, n = 4
 * 输出: 1->4->3->2->5->NULL
 * 思路,将需要移动的区间的头结点的下一个结点放到首部,其他结点位置相对不变动
 * @author Xiaoyu
 * @date 2020/4/3 - 16:01
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null || head.next == null) return head;
        if (m == n) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;//创建一个头结点

        ListNode prehead = dummy;//前置结点
        //找到要交换的位置的头结点的前置
        for (int i = 1; i < m; i++) prehead = prehead.next;
        head = prehead.next;//找到头

        //将头部的后一个结点放在前面,其他结点位置相对不变,总共需要交换m-n次
        for (int i = 0; i < n - m; i++) {
            ListNode temp = head.next;//找到交换结点
            head.next = temp.next;
            temp.next = prehead.next;
            prehead.next = temp;
        }
        return dummy.next;
    }

}
