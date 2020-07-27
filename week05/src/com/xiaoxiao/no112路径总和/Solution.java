package com.xiaoxiao.no112路径总和;

/**给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
 说明: 叶子节点是指没有子节点的节点。
 * @author Xiaoyu
 * @date 2020/4/8 - 20:02
 */
public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        //考虑使用回溯法
        if(root == null) return false;
        if (root.left == null && root.right == null)   return sum - root.val == 0;//找到叶子结点
        return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);
    }
}
