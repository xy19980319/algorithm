package com.xiaoxiao.链表的中间结点;

/**
 * 给定一个带有头结点 head 的非空单链表，返回链表的中间结点。
 * 如果有两个中间结点，则返回第二个中间结点。
 * 示例 1：
 * 输入：[1,2,3,4,5]
 * 输出：此列表中的结点 3 (序列化形式：[3,4,5])
 * 返回的结点值为 3 。 (测评系统对该结点序列化表述是 [3,4,5])。
 * 注意，我们返回了一个 ListNode 类型的对象 ans，这样：
 * ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, 以及 ans.next.next.next = NULL.
 * 示例 2：
 * 输入：[1,2,3,4,5,6]
 * 输出：此列表中的结点 4 (序列化形式：[4,5,6])
 * 由于该列表有两个中间结点，值分别为 3 和 4，我们返回第二个结点。
 * 提示：
 * 给定链表的结点数介于 1 和 100 之间。
 *
 * @author Xiaoyu
 * @date 2020/3/23 - 0:15
 */
public class Solution {
    public ListNode middleNode(ListNode head) {
        if (head.next == null) return head;
        ListNode newHead = new ListNode(0);
        newHead.next = head;//新建一个头结点方便操作
        ListNode slow = newHead;//设置慢指针
        ListNode quick = newHead;//设置快指针
        while (quick != null && quick.next != null) {
            slow = slow.next;//满指针后移一个
            quick = quick.next.next;//快指针后移两个
        }
        if(quick == null) return slow;//奇数结点
        return slow.next;
    }
}
