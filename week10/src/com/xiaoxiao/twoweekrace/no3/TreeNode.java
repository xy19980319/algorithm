package com.xiaoxiao.twoweekrace.no3;

/**
 * @author Xiaoyu
 * @date 2020/5/16 - 23:06
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
