package com.xiaoxiao.no226翻转二叉树;
import java.util.LinkedList;
import	java.util.Queue;

import javax.swing.tree.TreeNode;
import java.util.Queue;

/**
 * @author Xiaoyu
 * @date 2020/6/12 - 21:38
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null||(root.left==null && root.right==null)) return root;
        TreeNode newLeft =null;
        TreeNode newRight = null;
        if(root.left!=null) {
            newLeft = root.left;
        }
        if(root.right!=null) {
            newRight = root.right;
        }
        root.left = invertTree(newRight);
        root.right = invertTree(newLeft);
        return root;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
