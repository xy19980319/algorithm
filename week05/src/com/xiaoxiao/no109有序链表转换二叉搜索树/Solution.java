package com.xiaoxiao.no109有序链表转换二叉搜索树;

import java.util.Arrays;

/**
 * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 *
 * @author Xiaoyu
 * @date 2020/4/8 - 17:42
 */
public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return new TreeNode(head.val);
        ListNode pre = head, slow = head.next, fast = head.next.next;
        while (fast != null && fast.next != null) {
            pre = pre.next;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = null;    // pre  用于从中点断链
        TreeNode root = new TreeNode(slow.val);
        root.left  = sortedListToBST(head);
        root.right = sortedListToBST(slow.next);
        return root;
    }
    public TreeNode sortedListToBST1(ListNode head) {
        ListNode dummy = new ListNode(0);//虚拟头结点
        dummy.next = head;
        ListNode slow = dummy;
        ListNode quick = dummy;
        while (quick != null&&quick.next!=null) {
            slow = slow.next;
            quick = quick.next.next;
        }
        TreeNode root = new TreeNode(slow.val); //根节点
        root.left = buildTree(dummy,slow);
        root.right = buildTree(slow,quick);
        return root;
    }

    private TreeNode buildTree(ListNode dummy, ListNode tail) {
        if(dummy.next ==tail) return null;
        ListNode slow = dummy;
        ListNode quick = dummy;
        while(quick != tail.next&&quick.next!=tail) {
            slow = slow.next;
            quick = quick.next.next;
        }
        TreeNode root = new TreeNode(slow.val); //根节点
        root.left = buildTree(dummy,slow);
        root.right = buildTree(slow,quick);
        return root;
    }
}
