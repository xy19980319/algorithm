package com.xiaoxiao.no129求根到叶子节点数字之和;

/**
 * @author Xiaoyu
 * @date 2020/4/10 - 11:49
 */
public class Solution {
    int sum = 0;

    public int sumNumbers(TreeNode root) {
        if (root == null) return sum;
        StringBuilder num = new StringBuilder();
        dfs(root, num);
        return sum;
    }

    private void dfs(TreeNode root, StringBuilder num) {
        if (root.left == null && root.right == null) {
            sum += Integer.parseInt(num.append(root.val).toString());
            return;
        }
        num.append(root.val);
        if(root.left != null) {
            dfs(root.left, num);
            num.deleteCharAt(num.length() -1);//回溯
        }
        if(root.right != null) {
            dfs(root.right, num);
            num.deleteCharAt(num.length() -1);
        }
    }
}
