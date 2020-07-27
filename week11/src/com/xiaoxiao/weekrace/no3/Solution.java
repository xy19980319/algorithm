package com.xiaoxiao.weekrace.no3;

/**
 * 给你一棵二叉树，每个节点的值为 1 到 9 。我们称二叉树中的一条路径是 「伪回文」的，当它满足：路径经过的所有节点值的排列中，存在一个回文序列。
 * <p>
 * 请你返回从根到叶子节点的所有路径中 伪回文 路径的数目。
 *
 * @author Xiaoyu
 * @date 2020/5/24 - 9:16
 */
public class Solution {
    int res = 0;

    public int pseudoPalindromicPaths(TreeNode root) {
        int[] counts = new int[10];
        dfs(root, counts);
        return res;
    }

    private void dfs(TreeNode root, int[] counts) {
        if(root == null) return;
        counts[root.val] += 1;
        if (root.left == null&&root.right == null) {
            if(isEcho(counts)) {
                res++;
            }
            return;
        }
        dfs(root.left,counts);
        if(root.left != null) {
            counts[root.left.val] -= 1;
        }
        dfs(root.right,counts);
        if(root.right != null) {
            counts[root.right.val] -= 1;
        }

    }

    private boolean isEcho(int[] counts) {
        int single = 0;
        boolean isSingle = true;
        for (int i = 1; i < counts.length; i++) {
            if(counts[i]%2 != 0) single++;
        }
        isSingle = single <= 1;
        return isSingle;
    }
}
