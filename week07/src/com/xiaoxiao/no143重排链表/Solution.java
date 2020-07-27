package com.xiaoxiao.no143重排链表;

/**
 * 给定一个单链表 L：L0→L1→…→Ln-1→Ln ，
 * 将其重新排列后变为： L0→Ln→L1→Ln-1→L2→Ln-2→…
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 * 示例 1:
 * 给定链表 1->2->3->4, 重新排列为 1->4->2->3.
 * 示例 2:
 * 给定链表 1->2->3->4->5, 重新排列为 1->5->2->4->3.
 *
 * @author Xiaoyu
 * @date 2020/4/20 - 22:18
 */
public class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null||head.next.next == null) return;
        ListNode preCurr = new ListNode(0);//创建遍历的前置结点
        preCurr.next = head;
        ListNode curr = head;//遍历使用的结点
        ListNode nextHead = head.next;//记录头结点的后一个结点,后续递归调用
        //找到链表的末尾
        // boolean isOdd = true;//记录链表的奇偶性,默认是奇数
        while (curr.next != null && curr.next.next != null) {
            preCurr = preCurr.next.next;
            curr = curr.next.next;
        }
        //isOdd = (curr.next == null); //如果遍历到Null,那么就是奇数,否则为偶数
        ListNode last;
        if(curr.next == null) {
            last = curr;
        }else {
            last = curr.next;
            preCurr = preCurr.next;
        }
        //ListNode last = isOdd ? curr : curr.next;
        last.next = nextHead;
        head.next = last;
        preCurr.next = null;
        reorderList(nextHead);
    }
    public void reorderList1(ListNode head) {
        insertLast(head);
    }

    public void insertLast(ListNode head) {
        if (head == null || head.next == null||head.next.next == null) return;
        ListNode preCurr = new ListNode(0);//创建遍历的前置结点
        preCurr.next = head;
        ListNode curr = head;//遍历使用的结点
        ListNode nextHead = head.next;//记录头结点的后一个结点,后续递归调用
        //找到链表的末尾
       // boolean isOdd = true;//记录链表的奇偶性,默认是奇数
        while (curr.next != null && curr.next.next != null) {
            preCurr = preCurr.next.next;
            curr = curr.next.next;
        }
        //isOdd = (curr.next == null); //如果遍历到Null,那么就是奇数,否则为偶数
        ListNode last;
        if(curr.next == null) {
            last = curr;
        }else {
            last = curr.next;
            preCurr = preCurr.next;
        }
        //ListNode last = isOdd ? curr : curr.next;
        last.next = nextHead;
        head.next = last;
        preCurr.next = null;
        insertLast(nextHead);
    }
}
