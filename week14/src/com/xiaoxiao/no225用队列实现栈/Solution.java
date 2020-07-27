package com.xiaoxiao.no225用队列实现栈;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Xiaoyu
 * @date 2020/6/12 - 21:26
 */
public class Solution {
    class MyStack {
        private LinkedList queue;
        /** Initialize your data structure here. */
        public MyStack() {
            this.queue = new LinkedList();
        }

        /** Push element x onto stack. */
        public void push(int x) {
            queue.add(x);
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            int last = (int) queue.removeLast();
            return last;
        }

        /** Get the top element. */
        public int top() {
            int last = (int) queue.getLast();
            return last;
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return queue.isEmpty();
        }
    }
}
