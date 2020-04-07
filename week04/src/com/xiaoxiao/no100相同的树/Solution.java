package com.xiaoxiao.no100相同的树;

/**给定两个二叉树，编写一个函数来检验它们是否相同。
 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 * @author Xiaoyu
 * @date 2020/4/7 - 11:35
 */
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if((p ==null && q != null)||(p !=null && q == null)) return false;
        if(p==null) return true;
        return p.val == q.val && (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
    }
}
