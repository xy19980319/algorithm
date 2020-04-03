package com.xiaoxiao.no91解码方式;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/4/3 - 14:52
 */
public class TestDemo {
    @Test
    public void test() {
        String str = "100";
        Solution s= new Solution();
        int i = s.numDecodings(str);
        System.out.println(i);
    }
}
