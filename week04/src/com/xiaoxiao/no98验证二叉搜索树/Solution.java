package com.xiaoxiao.no98验证二叉搜索树;

/**
 * @author Xiaoyu
 * @date 2020/4/6 - 19:20
 */
public class Solution {
    long max =Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if (root==null) return true;//遍历到了叶子结点
        return isValidBST(root.left) && visitRoot(root)&&isValidBST(root.right);//如果左右子树都有效,那么他就是有效
    }

    /**
     * 测试结点的递增性,如果是递增的,就保证能够中序遍历的进行
     * @param root
     * @return
     */
    private boolean visitRoot(TreeNode root) {
        if (root.val > max) {
            // 增大记录最大值
            max = root.val;
            return true;
        } else return false;
    }
}
