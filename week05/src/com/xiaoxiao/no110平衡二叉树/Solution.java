package com.xiaoxiao.no110平衡二叉树;

/**
 * @author Xiaoyu
 * @date 2020/4/8 - 19:06
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int res = depth(root.left)-depth(root.right);
        return res >=-1 &&res<=1&&isBalanced(root.left)&&isBalanced(root.right);//分别看该结点,左节点和右节点是否满足

    }

    private int depth(TreeNode root) {
        if(root == null) return 0;
        return 1+Math.max(depth(root.left),depth(root.right));
    }
}
