package com.xiaoxiao.no102二叉树的层序遍历;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
 *
 * @author Xiaoyu
 * @date 2020/4/7 - 15:01
 */
public class Solution {
    List<List<Integer>> nums = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return nums;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> num = new ArrayList<>();
            int size = queue.size();
            //进行size次出队,就是本层元素出队
            while (size > 0) {
                TreeNode node = queue.removeFirst();//出队元素
                num.add(node.val);//将出队的元素加入
                //将出队元素的左子树和右子树加入队列
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                size--;
            }
            nums.add(num);
        }
        return nums;
    }
}
