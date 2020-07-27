package com.xiaoxiao.no145二叉树的后序遍历;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * @author Xiaoyu
 * @date 2020/4/27 - 23:14
 */
public class Solution {
    //迭代算法
    public List<Integer> postorderTraversal(TreeNode root) {
        //考虑到加入一个数,然后把他的右边左边按顺序加入
        if (root == null) return new ArrayList<>();
        List<Integer> res = new ArrayList<>();

        return res;
    }

    public class ListNode {
        int val;
        ListNode next;

        public ListNode(int x) {
            this.val = x;
        }

    }

    ;
    /*
    //递归算法
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<Integer> res = new ArrayList<> ();
        dfs(root,res);
        return res;
    }
    private void dfs(TreeNode root, List<Integer> res) {
        if(root == null) return;
        if(root.left != null) dfs(root.left,res);
        if(root.right != null) dfs(root.right,res);
        res.add(root.val);
    }*/
}
