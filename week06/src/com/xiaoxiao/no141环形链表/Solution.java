package com.xiaoxiao.no141环形链表;


/**
 * 给定一个链表，判断链表中是否有环。
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 * 输入：head = [3,2,0,-4], pos = 1
 * 输出：true
 * 解释：链表中有一个环，其尾部连接到第二个节点。
 *
 * @author Xiaoyu
 * @date 2020/4/18 - 14:26
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode dummy = new ListNode(0);//定义一个虚拟头结点
        boolean isHasCycle = false;
        dummy.next = head;
        //定义一个快慢指针,总有一天快指针会追上
        ListNode slow = dummy.next;
        ListNode fast = head.next;
        //如果fast到了尾部或者与slow相遇则结束循环
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                isHasCycle = true;
                break;
            }
        }
        //环形列表快指针比慢指针要多走一圈,这个位置到环的起点的位置和头结点到环起点距离相同
        if (isHasCycle) {
            ListNode curr = dummy;
            while (slow != curr) {
                slow = slow.next;
                curr = curr.next;
            }
            return curr;

        } else return null;
    }
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode dummy = new ListNode(0);//定义一个虚拟头结点
        boolean isHasCycle = false;
        dummy.next = head;
        //定义一个快慢指针,总有一天快指针会追上
        ListNode slow = dummy.next;
        ListNode fast = head.next;
        //如果fast到了尾部或者与slow相遇则结束循环
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                isHasCycle = true;
                break;
            }
        }
        return false;
    }
}
