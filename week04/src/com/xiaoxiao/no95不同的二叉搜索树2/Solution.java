package com.xiaoxiao.no95不同的二叉搜索树2;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个整数 n，生成所有由 1 ... n 为节点所组成的二叉搜索树。
 * <p>
 * 示例:
 * <p>
 * 输入: 3
 * 输出:
 * [
 *   [1,null,3,2],
 *   [3,2,null,1],
 *   [3,1,null,null,2],
 *   [2,1,3],
 *   [1,null,2,null,3]
 * ]
 *
 * @author Xiaoyu
 * @date 2020/4/5 - 10:42
 */
public class Solution {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return new ArrayList<TreeNode>();
        return genera(1, n);
    }

    private List<TreeNode> genera(int start, int end) {
        //递归的核心思路就是将树分为左右两边,为1~i-1,右边是i+1~n,最后将两个数连接在节点上
        List<TreeNode> res = new ArrayList<>();

        if(start > end) {
            res.add(null);
            return res;
        }
        for (int i = start; i <= end; i++) {
            List<TreeNode> subleftTrees = genera(start,i-1);//左子树
            List<TreeNode> subrightTrees = genera(i+1,end);//左子树

            for (TreeNode left : subleftTrees) {
                for (TreeNode right : subrightTrees) {
                    TreeNode node = new TreeNode(i);
                    node.left = left;
                    node.right = right;
                    res.add(node);//加入该结点
                }

            }
        }
        return res;
    }

}
