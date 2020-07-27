package com.xiaoxiao.no445两数相加2;

import java.util.Stack;
import java.util.Stack;

/**
 * @author Xiaoyu
 * @date 2020/4/14 - 22:54
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy1 = new ListNode(0);//创建虚拟头结点
        ListNode dummy2 = new ListNode(0);
        dummy1.next = l1;
        dummy2.next = l2;
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        Stack<Integer> stack1 = new Stack<>();//l1保存位置
        Stack<Integer> stack2 = new Stack<>();//l2保存位置
        //因为加法是从后往前加能保留进位,所以使用栈能够让其先入后出
        while (cur1 != null || cur2 != null) {
            if (cur1 != null) {
                stack1.push(cur1.val);
                cur1 = cur1.next;
            }
            if (cur2 != null) {
                stack2.push(cur2.val);
                cur2 = cur2.next;
            }
        }
        ListNode newList = new ListNode(0);//创建一个带头的新虚拟结点
        ListNode lastNode = null;//记录上一次的结点位置
        boolean isNeedCarry = false;//记录是否需要进位
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            //如果两个栈有不为空的,将其输出然后相加
            int pop1 = 0;
            int pop2 = 0;
            if (!stack1.isEmpty()) pop1 = stack1.pop();
            if (!stack2.isEmpty()) pop2 = stack2.pop();
            int num = (pop1 + pop2) + (isNeedCarry ? 1 : 0); //如果需要进位,就将数加1
            if (num >= 10) isNeedCarry = true;//看是否需要进位
            else isNeedCarry = false;
            ListNode node = new ListNode(num%10);
            newList.next = node;//将新的结点添加到头结点后
            node.next = lastNode;
            lastNode = node;
        }
        //如果还要进位,那就将1添加到头结点后
        if(isNeedCarry) {
            ListNode node = new ListNode(1);
            newList.next =node;
            node.next = lastNode;
        }
        return newList.next;
    }
}
