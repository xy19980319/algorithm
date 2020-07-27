package com.xiaoxiao.twoweekrace.no3;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 5398. 统计二叉树中好节点的数目
 * 给你一棵根为 root 的二叉树，请你返回二叉树中好节点的数目。
 * <p>
 * 「好节点」X 定义为：从根到该节点 X 所经过的节点中，没有任何节点的值大于 X 的值。
 *
 * @author Xiaoyu
 * @date 2020/5/16 - 22:26
 */
public class Solution {
    int nums = 0;
    public int goodNodes(TreeNode root) {
        int max = Integer.MIN_VALUE;
        dfs(root,max);
        return nums;
    }

    private void dfs(TreeNode root,int max) {
        if (root == null) return;
        int val = root.val;
        if (val >= max) {
            max = val;
            nums++;
        }
        dfs(root.left,max);
        dfs( root.right,max);
    }
}
