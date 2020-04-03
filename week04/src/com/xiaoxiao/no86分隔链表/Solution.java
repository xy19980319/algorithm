package com.xiaoxiao.no86分隔链表;

/**给定一个链表和一个特定值 x，对链表进行分隔，使得所有小于 x 的节点都在大于或等于 x 的节点之前。
 你应当保留两个分区中每个节点的初始相对位置。

 示例:

 输入: head = 1->4->3->2->5->2, x = 3
 输出: 1->2->2->4->3->5

 * @author Xiaoyu
 * @date 2020/4/3 - 9:56
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head == null||head.next == null) return head;

        ListNode headNode = new ListNode(0);
        headNode.next = head;//新建一个头结点
        //新建四个指针
        ListNode small = headNode;//比x小的指针
        ListNode big = headNode;//比x大的指针
        ListNode curr = head;//遍历指针
        ListNode assist = headNode;//辅助交换指针

        //加个条件看看什么时候找到big
        boolean isFindBig = false;

        while(curr != null) {
            //找到第一个比x的指针锁定
            if(!isFindBig&&curr.val>=x) {
                big = curr;
                assist = big;
                isFindBig=true;
                curr = curr.next;
                continue;
            }
            //如果值比x小,放在small指针后面
            if(curr.val<x) {
                if(isFindBig) {
                    assist.next = curr.next;//断开后面连接,避免环
                    small.next = curr;//将该位置的结点放在small后面
                    curr.next = big;//街上BIG
                    curr = assist;
                }
                small = small.next;//small后移
            }else {
                assist = assist.next;
            }
            curr = curr.next;
        }
        return headNode.next;
    }
}
