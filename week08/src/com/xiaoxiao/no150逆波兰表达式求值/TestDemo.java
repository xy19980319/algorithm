package com.xiaoxiao.no150逆波兰表达式求值;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/4/28 - 16:42
 */
public class TestDemo {
    @Test
    public void test() {
        String[] strs= {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        Solution s = new Solution();
        int i = s.evalRPN(strs);
        System.out.println(i);
    }
}
