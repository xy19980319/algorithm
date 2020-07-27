package com.xiaoxiao.no111二叉树的最小深度;

/**
 * @author Xiaoyu
 * @date 2020/4/8 - 19:54
 */
public class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null) return 1 + minDepth(root.right);
        if (root.right == null) return 1 + minDepth(root.left);
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
}
