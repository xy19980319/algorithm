package com.xiaoxiao.no131分割回文串;

import org.junit.Test;

import java.util.List;

/**
 * @author Xiaoyu
 * @date 2020/4/13 - 9:08
 */
public class TestDemo {
    @Test
    public void test() {
        Solution s= new Solution();
        List<List<String>> lists = s.partition("aab");
        System.out.println(lists);
    }
}
