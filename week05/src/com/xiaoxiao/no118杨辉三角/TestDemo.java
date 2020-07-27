package com.xiaoxiao.no118杨辉三角;

import org.junit.Test;

import java.util.List;

/**
 * @author Xiaoyu
 * @date 2020/4/9 - 10:42
 */
public class TestDemo {
    @Test
    public void test() {
        Solution s = new Solution();
        List<List<Integer>> lists = s.generate(5);
        System.out.println(lists);
    }
}
