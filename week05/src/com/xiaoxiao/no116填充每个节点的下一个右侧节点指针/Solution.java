package com.xiaoxiao.no116填充每个节点的下一个右侧节点指针;


import java.util.LinkedList;

/**
 * 给定一个完美二叉树，其所有叶子节点都在同一层，每个父节点都有两个子节点。二叉树定义如下：
 * <p>
 * struct Node {
 * int val;
 * Node *left;
 * Node *right;
 * Node *next;
 * }
 * 填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL。
 * <p>
 * 初始状态下，所有 next 指针都被设置为 NULL
 *
 * @author Xiaoyu
 * @date 2020/4/9 - 9:11
 */
public class Solution {
    public Node connect(Node root) {
        if (root == null) return null;
        LinkedList<Node> queue = new LinkedList<Node>();
        queue.add(root);
        //层序遍历
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                if (size > 1) queue.get(0).next = queue.get(1);
                Node node = queue.removeFirst();
                if (node.left != null) queue.addLast(node.left);
                if (node.right != null) queue.addLast(node.right);
                size--;
            }
        }
        return root;
    }
}
