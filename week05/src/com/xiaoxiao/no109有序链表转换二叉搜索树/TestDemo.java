package com.xiaoxiao.no109有序链表转换二叉搜索树;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/4/6 - 19:21
 */
public class TestDemo {
    @Test
    public void test() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        Solution s= new Solution();
        ListNode l1 = new ListNode(-10);
        l1.next = new ListNode(-3);
        l1.next.next = new ListNode(0);
        l1.next.next.next = new ListNode(5);
        l1.next.next.next.next = new ListNode(9);
        TreeNode treeNode = s.sortedListToBST(l1);
        System.out.println(treeNode);
    }
}
