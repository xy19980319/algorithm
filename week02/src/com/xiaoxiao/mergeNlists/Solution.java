package com.xiaoxiao.mergeNlists;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
 * 示例:
 * 输入:
 * [
 * 1->4->5,
 * 1->3->4,
 * 2->6
 * ]
 * 输出: 1->1->2->3->4->4->5->6
 *
 * @author Xiaoyu
 * @date 2020/3/19 - 23:24
 */
public class Solution {
    public ListNode mergeKLists(ListNode... lists) {
        ListNode merge = new ListNode(0);
        if (lists == null || lists.length == 0) {
            return null;
        }
        //将所有的链表加入最小优先队列中
        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<> ((o1, o2) -> o1.val-o2.val);
        //Collections.addAll(priorityQueue,lists);
        //考虑链表阿为空
        for (ListNode list : lists) {
            if(list==null) {
                continue;
            }
            priorityQueue.add(list);
        }

        ListNode mergeCurr = merge;
        //将最小头结点移出
        while(!priorityQueue.isEmpty()) {
            //将最小结点移除
            ListNode least = priorityQueue.poll();
            mergeCurr.next =least;
            mergeCurr = mergeCurr.next;
            //将最小节点后的结点加入
            if(least.next!=null) {
                priorityQueue.add(least.next);
            }
        }
        return merge.next;


    }
/*    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        //定义一个头指针
        ListNode mergeNode = lists[1];

        for (int i = 1; i < lists.length; i++) {
            //每次遍历,将合并数组的指针指向开始
            ListNode mergeCurr = mergeNode;
            //设置一个后续指针
            ListNode seqCurr = mergeCurr.next;
            //开始遍历元素大小,如果比前一个数小则插入
            ListNode listCurr = lists[i];
            while (listCurr.val >= mergeNode.val && listCurr.val <= seqCurr.val) {
                mergeCurr.next = listCurr;
                listCurr.next = seqCurr;
            }


        }

    }*/
}
