package com.xiaoxiao.no227基本计算器2;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/6/12 - 23:45
 */
public class TestDemo {
    @Test
    public void test() {
        String str = "2*3+4";
        Solution s= new Solution();
        int i = s.calculate(str);
        System.out.println(i);
    }
}
