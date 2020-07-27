package com.xiaoxiao.no222完全二叉树的节点个数;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Xiaoyu
 * @date 2020/6/11 - 22:30
 */
public class Solution {
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        //层序遍历,遍历到空就退出
        int floors = 0;
        boolean isButton = false;//标机是否到底
        while(!queue.isEmpty()) {
            floors++;
            int size = queue.size();
            while (size > 0) {
                TreeNode poll = queue.poll();//出队列
                if(poll.left!=null) queue.add(poll.left);
                else {
                    isButton = true;
                    size--;
                    break;
                }
                if(poll.right!=null) queue.add(poll.right);
                else {
                    isButton = true;
                    size--;
                    break;
                }
                size--;
            }
            //到达了底部
            if(isButton) {
                //将剩下的底层前一层去除
                while (size>0) {
                    queue.poll();//出队列
                    size--;
                }
                break;
            }
        }
        int buttonNum = queue.size();//最底层的元素个数
        return buttonNum+(int)Math.pow(2,floors)-1;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}

