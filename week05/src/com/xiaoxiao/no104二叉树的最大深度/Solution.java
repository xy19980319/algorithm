package com.xiaoxiao.no104二叉树的最大深度;

/**
 * 给定一个二叉树，找出其最大深度。
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * @author Xiaoyu
 * @date 2020/4/7 - 17:13
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        //最大深度是左子树和右子树的最大深度加1
        if(root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
