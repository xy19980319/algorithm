package com.xiaoxiao.no105从前序与中序遍历序列构造二叉树;

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
        root.left.left.left = new TreeNode(8);
        root.left.left.right = new TreeNode(9);
        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(11);
        Solution s = new Solution();
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
      /*  int[] preorder = {1,2};
        int[] inorder = {1,2};*/
        TreeNode node = s.buildTree(preorder, inorder);
        System.out.println(node);

    }
}
