package com.xiaoxiao.no100相同的树;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/4/6 - 19:21
 */
public class TestDemo {
    @Test
    public void test() {
        TreeNode root = new TreeNode(5);
        root.right = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(6);
        TreeNode root1 = new TreeNode(5);
        root1.right = new TreeNode(5);
        root1.left = new TreeNode(1);
        root1.right.left = new TreeNode(3);
        root1.right.right = new TreeNode(3);
        Solution s= new Solution();
        boolean sameTree = s.isSameTree(root, root1);
        System.out.println(sameTree);
    }
}
