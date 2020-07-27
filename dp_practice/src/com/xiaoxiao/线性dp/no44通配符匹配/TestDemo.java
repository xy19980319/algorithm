package com.xiaoxiao.线性dp.no44通配符匹配;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/5/25 - 23:49
 */
public class TestDemo {
    @Test
    public void test() {
        Solution s= new Solution();
        boolean b = s.isMatch(
                "adceb", "*a*b");
        System.out.println(b);
    }
}
