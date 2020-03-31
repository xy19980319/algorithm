package com.xiaoxiao.mergeTwoLists;

/**
 * @author Xiaoyu
 * @date 2020/3/18 - 23:29
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        //给两个链表创建头指针
        ListNode firCurr = l1;
        ListNode secCurr = l2;

        //创建一个新的链表来接受两个链表
        ListNode newList = null;
        if (firCurr.val <= secCurr.val) {
            newList = firCurr;
            firCurr = firCurr.next;
        } else {
            newList = secCurr;
            secCurr = secCurr.next;
        }
        //给新链表创建一个指针
        ListNode newCurr = newList;

        //从头到尾遍历
        while (firCurr != null && secCurr != null) {

            if (firCurr.val <= secCurr.val) {
                newCurr.next = firCurr;
                firCurr = firCurr.next;
            } else {
                newCurr.next = secCurr;
                secCurr = secCurr.next;
            }
            newCurr = newCurr.next;
        }
        if (firCurr == null) {
            newCurr.next = secCurr;
        } else {
            newCurr.next = firCurr;
        }
        return newList;
    }
}
