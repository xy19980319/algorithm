package com.xiaoxiao.no199二叉树的右视图;

import java.util.ArrayDeque;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author Xiaoyu
 * @date 2020/4/29 - 16:16
 */
public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        //才用层序遍历,每层最后出栈的元素是右边元素
        if (root == null) return new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> queue = new ArrayDeque<>();//新建一个队列
        queue.add(root);//将根节点加入队列
        while (!queue.isEmpty()) {
            int size = queue.size();
            //res.add(queue.peek().val);//将先出栈的存入数组
            //每层size个结点
            while (size > 0) {
                TreeNode node = queue.removeFirst();
                if (size == 1)
                    res.add(node.val);
                //将左边结点先压栈
                if (node.left != null) queue.addLast(node.left);
                if (node.right != null) queue.addLast(node.right);
                size--;
            }
        }
        return res;
    }
}
