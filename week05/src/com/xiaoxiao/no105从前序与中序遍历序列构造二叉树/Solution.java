package com.xiaoxiao.no105从前序与中序遍历序列构造二叉树;

import java.util.Arrays;

/**
 * 根据一棵树的前序遍历与中序遍历构造二叉树。
 * 注意:
 * 你可以假设树中没有重复的元素。
 *
 * @author Xiaoyu
 * @date 2020/4/7 - 21:02
 */
public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }
        int num = preorder[0];
        TreeNode root = new TreeNode(num);
        int index = search(inorder, num);
        root.left = buildTree(Arrays.copyOfRange(preorder, 1, 1 + index), Arrays.copyOfRange(inorder, 0, index));
        root.right = buildTree(Arrays.copyOfRange(preorder, 1 + index, preorder.length), Arrays.copyOfRange(inorder, index + 1, inorder.length));
        return root;
    }

    private int search(int[] inorder, int num) {
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == num) return i;
        }
        return -1;
    }
}
