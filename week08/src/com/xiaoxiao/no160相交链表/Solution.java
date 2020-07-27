package com.xiaoxiao.no160相交链表;

/**
 * 编写一个程序，找到两个单链表相交的起始节点。
 *
 * @author Xiaoyu
 * @date 2020/4/29 - 9:07
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode currA = headA;
        ListNode currB = headB;
        //找到短的等长的位置
        while (currA != null && currB != null) {
            currA = currA.next;
            currB = currB.next;
        }
        ListNode temp;
        //A是短边
        if(currA == null) {
            temp = headB;
            while (currB != null) {
                currB = currB.next;
                temp = temp.next;
            }
            while(headA!=null) {
                if(headA == temp) return temp;
                headA = headA.next;
                temp = temp.next;
            }
        }else{
            temp = headA;
            while (currA != null) {
                currA = currA.next;
                temp = temp.next;
            }
            while(headB!=null) {
                if(headB == temp) return temp;
                headB = headB.next;
                temp = temp.next;
            }
        }
        return null;
    }
}
