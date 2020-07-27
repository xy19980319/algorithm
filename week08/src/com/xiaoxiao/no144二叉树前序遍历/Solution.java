package com.xiaoxiao.no144二叉树前序遍历;

import java.util.ArrayList;
import java.util.List;

/**给定一个二叉树，返回它的 前序 遍历。
 * 递归算法很简单，你可以通过迭代算法完成吗？
 * @author Xiaoyu
 * @date 2020/4/27 - 22:59
 */
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<Integer> res = new ArrayList<> ();
        dfs(root,res);
        return res;
    }

    private void dfs(TreeNode root, List<Integer> res) {
        if(root == null) return;
        res.add(root.val);
        if(root.left != null) dfs(root.left,res);
        if(root.right != null) dfs(root.right,res);
    }
}
