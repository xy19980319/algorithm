package com.xiaoxiao.旋转链表;

/**
 * 给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
 * 示例 1:
 * 输入: 1->2->3->4->5->NULL, k = 2
 * 输出: 4->5->1->2->3->NULL
 * 解释:
 * 向右旋转 1 步: 5->1->2->3->4->NULL
 * 向右旋转 2 步: 4->5->1->2->3->NULL
 * 示例 2:
 * 输入: 0->1->2->NULL, k = 4
 * 输出: 2->0->1->NULL
 * 解释:
 * 向右旋转 1 步: 2->0->1->NULL
 * 向右旋转 2 步: 1->2->0->NULL
 * 向右旋转 3 步: 0->1->2->NULL
 * 向右旋转 4 步: 2->0->1->NULL
 *
 * @author Xiaoyu
 * @date 2020/3/26 - 20:13
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        int count = 0;
        ListNode headNode = new ListNode(0);
        headNode.next = head;//定义一个头结点
        ListNode last = headNode;//定义一个尾指针
        //统计链表结点数量,并找到尾结点的位置
        while (last.next != null) {
            last = last.next;
            count++;
        }
        int move = k % count; //要移动的倒数move个指针
        if(move==0) return head;
        ListNode m = headNode;//找到要移动到开始的结点
        ListNode prem = headNode;//找到m的前一个结点
        for (int i = 0; i < count - move; i++) prem = prem.next;
        m = prem.next;

        //开始进行位置变换
        prem.next = null;//移动的前置结点置空,他将转移到最后
        headNode.next = m;//m变为头结点
        last.next = head;//将头结点部分接在交换上的后面

        return headNode.next;


    }
}
