package com.xiaoxiao.no147对链表进行插入排序;

/**
 * 插入排序算法：
 * <p>
 * 插入排序是迭代的，每次只移动一个元素，直到所有元素可以形成一个有序的输出列表。
 * 每次迭代中，插入排序只从输入数据中移除一个待排序的元素，找到它在序列中适当的位置，并将其插入。
 * 重复直到所有输入数据插入完为止。
 * 示例 1：
 * 输入: 4->2->1->3
 * 输出: 1->2->3->4
 * 示例 2：
 * <p>
 * 输入: -1->5->3->4->0
 * 输出: -1->0->3->4->5
 *
 * @author Xiaoyu
 * @date 2020/4/28 - 0:03
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        dummy.next = head;//创建虚拟头结点
        ListNode preCurr = head;//前置遍历结点
        ListNode curr = head.next;//遍历结点
        ListNode nextCurr = curr.next;//后置结点
        while (curr != null) {
            if (curr.val >= preCurr.val) {
                preCurr = preCurr.next;
                curr = curr.next;
                if (nextCurr != null) nextCurr = nextCurr.next;
                continue;
            }
            ListNode search = dummy.next;//新建搜索结点
            ListNode preSearch = dummy;//搜索前置
            //找到该位置的应该插入的位置
            while (search != curr && search.val <= curr.val) {
                search = search.next;
                preSearch = preSearch.next;
            }
            curr.next = search;
            preCurr.next = nextCurr;
            preSearch.next = curr;
            curr = nextCurr;
            if (nextCurr != null) nextCurr = nextCurr.next;
            //head = dummy.next;
        }
        return dummy.next;
    }
}
