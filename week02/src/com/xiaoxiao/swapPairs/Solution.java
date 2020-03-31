package com.xiaoxiao.swapPairs;

/**
 * @author Xiaoyu
 * @date 2020/3/20 - 19:04
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null||head.next == null) {
            return head;
        }
        //创建一个头结点
        ListNode preHead = new ListNode(0);
        ListNode preCurr = preHead;
        preHead.next = head;
        ListNode seqHead = head.next;

        //如果s后面有,那么不停止
        while (head.next != null) {
            //交换h和s的位置
            preCurr.next = seqHead;
            head.next = seqHead.next;
            seqHead.next = head;
            if(head.next!=null) {
                //h指针和s指针后移两个
                preCurr = head;
                head = head.next;
                seqHead = head.next;
            }

        }
        return preHead.next;


    }
}
