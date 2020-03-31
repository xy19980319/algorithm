package com.xiaoxiao.generateParenthesis;

import org.junit.Test;

import java.util.List;

/**
 * @author Xiaoyu
 * @date 2020/3/19 - 20:46
 */
public class TestDemo {
    @Test
    public void test() {
        Solution s = new Solution();
        List<String> strings = s.generateParenthesis(2);
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
