package com.xiaoxiao.no98验证二叉搜索树;

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
        Solution s= new Solution();
        boolean validBST = s.isValidBST(root);
        System.out.println(validBST);
    }
}
