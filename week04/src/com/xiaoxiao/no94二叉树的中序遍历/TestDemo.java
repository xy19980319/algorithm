package com.xiaoxiao.no94二叉树的中序遍历;

import org.junit.Test;

import java.util.List;

/**
 * @author Xiaoyu
 * @date 2020/4/4 - 22:56
 */
public class TestDemo {
    @Test
    public void test() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        Solution s= new Solution();
        List<Integer> integers = s.inorderTraversal(root);
        System.out.println(integers);

    }
}
