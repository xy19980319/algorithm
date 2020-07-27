package com.xiaoxiao.weekrace.no1;

import org.junit.Test;

import java.util.List;

/**
 * @author Xiaoyu
 * @date 2020/5/10 - 10:47
 */
public class TestDemo {
    @Test
    public void test() {
        int[] target = {2,3,4};
        int n = 4;
        Solution s = new Solution();
        List<String> strings = s.buildArray(target, n);
        System.out.println(strings);
    }
}
