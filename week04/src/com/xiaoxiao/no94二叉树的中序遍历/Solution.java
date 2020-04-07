package com.xiaoxiao.no94二叉树的中序遍历;

import java.util.ArrayList;
import java.util.List;

/**给定一个二叉树，返回它的中序 遍历。
 示例:
 输入: [1,null,2,3]
 1
 \
 2
 /
 3

 输出: [1,3,2]

 * @author Xiaoyu
 * @date 2020/4/4 - 22:55
 */
public class Solution {
    List<Integer> middle = new ArrayList<>();//新建一个集合存放中序遍历结点
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return middle;

        dfs(root);
        return middle;

    }

    private void dfs(TreeNode root) {
        if (root == null) return;
        //遍历左边,左边有值加入左边的值到集合中
        if(root.left!=null) dfs(root.left);
        middle.add(root.val);//中间节点加入
        if(root.right!=null) dfs(root.right);
    }
}
