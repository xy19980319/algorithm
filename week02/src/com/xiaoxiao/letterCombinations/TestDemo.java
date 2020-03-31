package com.xiaoxiao.letterCombinations;

import org.junit.Test;

import java.util.List;

/**
 * @author Xiaoyu
 * @date 2020/3/16 - 23:01
 */
public class TestDemo {
    @Test
    public void test() {
        Solution s = new Solution();
        List<String> strings = s.letterCombinations1("2");
        System.out.println(strings);
    }

}
