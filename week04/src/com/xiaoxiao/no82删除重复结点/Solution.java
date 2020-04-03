package com.xiaoxiao.no82删除重复结点;

/**
 * 给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字。
 * 示例 1:
 * <p>
 * 输入: 1->2->3->3->4->4->5
 * 输出: 1->2->5
 * 示例 2:
 * <p>
 * 输入: 1->1->1->2->3
 * 输出: 2->3
 *
 * @author Xiaoyu
 * @date 2020/4/2 - 9:57
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode headNode = new ListNode(0);
        headNode.next = head; //新建一个头结点方便操作

        ListNode curr = head.next;//创建一个遍历指针
        ListNode preCurr = headNode;//创造一个前置指针

        boolean isRepeated = false;
        int temp = head.val;//拿到临时指针
        //开始使用Curr指针遍历
        while (curr != null) {
            if (curr.val != temp) {
                if (!isRepeated) preCurr = preCurr.next;
                isRepeated = false;
                temp = curr.val;
                preCurr.next = curr;
            } else {
                isRepeated = true;
            }
            curr = curr.next;//指针后移
        }
        if (isRepeated) preCurr.next = null;//如果最后还有重复,那就直接让他的前置指向空指针
        return headNode.next;
    }

    /**
     * 删除重复的结点
     *
     * @param head
     * @return
     */
    public ListNode deleteDuplicates1(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode headNode = new ListNode(0);
        headNode.next = head; //新建一个头结点方便操作

        ListNode curr = head.next;//创建一个遍历指针
        ListNode preCurr = headNode;//创造一个前置指针

        int temp = head.val;//拿到临时指针
        //开始使用Curr指针遍历
        while (curr != null) {
            if (curr.val != temp) {
                preCurr = preCurr.next;
                temp = curr.val;
            }else {
                preCurr.next = curr;
            }
            curr = curr.next;//指针后移
        }
        //preCurr.next = curr;
        //if(preCurr.next!=curr)

        return headNode.next;
    }
    public ListNode deleteDuplicates3(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        if (head.val == head.next.val) {
            head = deleteDuplicates(head.next);
        } else {
            head.next = deleteDuplicates(head.next);
        }
        return head;
    }
}
