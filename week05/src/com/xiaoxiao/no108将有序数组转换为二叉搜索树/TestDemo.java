package com.xiaoxiao.no108将有序数组转换为二叉搜索树;

import org.junit.Test;

import java.util.List;

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
        int[] nums = {-10,-3,0,5,9};
        TreeNode treeNode = s.sortedArrayToBST(nums);
        System.out.println(treeNode);
    }
}
