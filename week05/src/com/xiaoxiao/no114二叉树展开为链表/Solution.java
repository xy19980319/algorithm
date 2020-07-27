package com.xiaoxiao.no114二叉树展开为链表;

/**给定一个二叉树，原地将它展开为链表。
 例如，给定二叉树
 * @author Xiaoyu
 * @date 2020/4/9 - 0:05
 */
public class Solution {
    public void flatten(TreeNode root) {
        /*思路,用递归的思想
        * 1.将节点的左树的左树全部接到右边
        * 2.将结点的右树的左树接到右边
        * 3.结点左树接右边,右树接左边的右边
        * */
        if(root == null) return;
        flatten(root.left);//将左树变成右链表
        flatten(root.right);//将右边树变成右链表
        TreeNode node = root.right;//记录右树
        root.right = root.left;
        root.left = null;
        TreeNode curr = root;
        while (curr.right != null) curr = curr.right;
        curr.right = node;
    }
}
