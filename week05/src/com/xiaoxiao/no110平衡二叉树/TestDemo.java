package com.xiaoxiao.no110平衡二叉树;

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
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        //root.left.right = new TreeNode(5);
        //root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);
        Solution s= new Solution();
        boolean balanced = s.isBalanced(root);
        System.out.println(balanced);
    }
}
