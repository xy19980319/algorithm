package com.xiaoxiao.no101对称二叉树;

/**给定一个二叉树，检查它是否是镜像对称的。
 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 * @author Xiaoyu
 * @date 2020/4/7 - 14:25
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return isSymmetric(root.left,root.right);//如果左树的左子树和右树的右子树相等则对称
    }

    public boolean isSymmetric(TreeNode left, TreeNode right) {
        if(left==null&&right == null)  return true; //左右为空
        if (left==null ||right == null) return false; //左右有一个不为空
        return left.val == right.val && isSymmetric(left.left, right.right)&&isSymmetric(left.right, right.left);
    }
}
