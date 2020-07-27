package com.xiaoxiao.no106从中序与后序遍历序列构造二叉树;

import java.util.Arrays;

/**
 * @author Xiaoyu
 * @date 2020/4/8 - 11:45
 */
public class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length ==0 ||postorder.length ==0) return null;
        TreeNode root = new TreeNode(postorder[postorder.length -1]); //后续遍历的最后一个就是头结点
        int index=0;
        //在中序遍历找到root的位置
        for (int i = 0; i < inorder.length; i++) {
            if(inorder[i] == postorder[postorder.length -1]) {
                index = i;//找到索引
                break;
            }
        }
        root.left = buildTree(Arrays.copyOfRange(inorder,0,index),Arrays.copyOfRange(postorder,0,index));
        root.right = buildTree(Arrays.copyOfRange(inorder,index+1,inorder.length),Arrays.copyOfRange(postorder,index,inorder.length-1));
        return root;
    }
}
