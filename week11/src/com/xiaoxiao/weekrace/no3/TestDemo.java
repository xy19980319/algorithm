package com.xiaoxiao.weekrace.no3;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/5/24 - 11:09
 */
public class TestDemo {
    @Test
    public void test() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(1);
        root.right.right = new TreeNode(1);
        Solution s = new Solution();
        int i = s.pseudoPalindromicPaths(root);
        System.out.println(i);
       /* root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.left.left = new TreeNode(8);
        root.left.left.right = new TreeNode(9);
        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(11);*/
    }
}
