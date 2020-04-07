package com.xiaoxiao.no72编辑距离;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/4/6 - 10:12
 */
public class TestDemo {
    @Test
    public void test() {
        Solution s = new Solution();
        int i = s.minDistance("sea",
                "ate");
        System.out.println(i);
    }
}
