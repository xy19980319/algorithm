package com.xiaoxiao.no113路径总和2;

import java.util.ArrayList;
import java.util.List;

/**给定一个二叉树和一个目标和，找到所有从根节点到叶子节点路径总和等于给定目标和的路径。
 说明: 叶子节点是指没有子节点的节点。
 * @author Xiaoyu
 * @date 2020/4/8 - 22:59
 */
public class Solution {
    List<List<Integer>> lists = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(root == null) return lists;
        List<Integer> list = new ArrayList<> (); //创建一个list
        dfs(list,root,sum);
        return lists;
    }

    private void dfs(List<Integer> list, TreeNode root, int sum) {
        if(root == null) return;
        list.add(root.val);
        //如果找到了叶子结点
        if(root.left==null && root.right ==null) {
            if(root.val == sum) lists.add(new ArrayList<>(list));
            return;
        }
        dfs(list,root.left, sum - root.val);//遍历左树
        if(root.left!=null) list.remove(list.size() -1);//如果不为空,说明加了树枝,需要剪枝
        dfs(list,root.right, sum - root.val);//遍历右树
        if(root.right!=null)list.remove(list.size() -1);//同上,这是又输
    }
}
